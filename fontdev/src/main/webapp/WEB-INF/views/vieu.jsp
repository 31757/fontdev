

<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">


    <title>CodePen - Sort and Filter a Table Using Angular</title>
    
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/my.css">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  

        <style>
      /*
  were using Bootstrap and Font Awesome
  http://bootstrapcdn.com
*/

body { padding-top:50px; }

        @import url('http://fonts.googleapis.com/css?family=Open+Sans:400,600,700');

      
      

      /* You can safely remove the next two lines */
      
      
      
          
      .main { margin: 0 auto; padding: 40px 20px; max-width: 960px; font-size: 19px; line-height: 30px;}
      .main a { color: #DB7580; text-transform: none; }
      
      /* Styling the Popup Window */
      
        .popup {display: none; position: absolute; top: 100px; left: 50%; width: 700px; margin-left: -350px; padding: 50px 30px;
            background: #fff; color: #333; font-size: 19px; line-height: 30px; border: 10px solid #150E2D; z-index: 9999;}
        .popup-mobile {position: relative; top: 0; left: 0; margin: 30px 0 0; width: 100%;}   
          .popup-btn-close {position: absolute; top: 8px; right: 14px; color: #4EBD79; font-size: 14px; font-weight: bold; text-transform: uppercase; cursor: pointer;} 
      </style>
      
    

    <script>
  window.console = window.console || function(t) {};
</script>

    
      <script>
    (function() {
      /*
      * Capture all errors for this pen
      **/
      window.onerror = function(/* message, file, line */) {
        return true;
      };

      /*
      * Capture and kill Web Audio and Speech
      */
      if (typeof (AudioContext) != "undefined" || typeof (webkitAudioContext) != "undefined") {
        AudioContext = function() {
          return false;
        };

        webkitAudioContext = function() {
          return false;
        };
      }

      if (typeof (mozAudioContext) != "undefined") {
        mozAudioContext = function() {
          return false;
        };
      }

      if ("speechSynthesis" in window) {
        window.speechSynthesis = {};
      }
      if ("speak" in speechSynthesis) {
        speechSynthesis.speak = function() {
          return false;
        };
      }

      // Kill the browser asking for access to the video cam or audio
      navigator.webkitGetUserMedia = function() {
        // stop all calls in the grid.
      };

      /**
      * Capture and kill animations after X number of seconds
      **/
      var __animationDuration = 4000;
      var __animationsTimedOut = false;
      var __animationRequests = [];
      var __requestAnimationFrame = false;
      var __cancelAnimationFrame = false;
      var x, i;

      var vendorsReqestAnimationFrame = [
        "requestAnimationFrame",
        "mozRequestAnimationFrame",
        "webkitRequestAnimationFrame"
      ];

      // find the browsers requestAnimationFrame and cancelAnimationFrame
      for (x = 0; x < vendorsReqestAnimationFrame.length; x++) {
        if (!__requestAnimationFrame) {
          __requestAnimationFrame = window[vendorsReqestAnimationFrame[x]
          ];
        }
      }

      __cancelAnimationFrame = window.cancelAnimationFrame || window.mozCancelAnimationFrame;

      // Wrap the requestAnimationFrame so we can stop it in the future
      function __reqFrame(callback, element) {
        // after the timeout we no longer take requests
        var timerID;
        if (__animationsTimedOut) {
          return 0;
        } else {
          timerID = __requestAnimationFrame(callback, element);
          __animationRequests.push(timerID);

          return timerID;
        }
      }

      for (x = 0; x < vendorsReqestAnimationFrame.length; x++) {
        window[vendorsReqestAnimationFrame[x]] = __reqFrame;
      }

      // Cancel the animations after expiration
      setTimeout(function() {
        for (i = 0; i < __animationRequests.length; i++) {
          __cancelAnimationFrame(__animationRequests[i]);
        }

        var ss = window.document.createElement("style");
        ss.textContent = "*, *::before, *::after { animation-play-state: paused !important; }";
        var ref = window.document.getElementsByTagName("script")[0];
        ref.parentNode.insertBefore(ss, ref);

        __animationsTimedOut = true;
      }, __animationDuration, "push");

      /**
      * Capture setInterval and setTimeout to kill after X number of seconds
      **/
      window.setInterval = (function(oldSetInterval) {
        var registered = [];

        function f(a,b) {
          // check if the time has expired,
          // after __animationDuration expires don't take anymore setIntervals
          if (this.timedOut) {
            return 0;
          } else {
            return registered[ registered.length ] = oldSetInterval(a,b);
          }
        }

        f.clearAll = function() {
          var r;

          while (r = registered.pop()) {
            clearInterval( r );
          }

          this.timedOut = true;
        };

        f.timedOut = false;

        return f;
      }(window.setInterval));

      window.setTimeout = (function(oldSetTimeout) {
        var registered = [];

        // because some of our timeouts may time out afterwards
        // we want to make sure they know the secret sauce to still use
        // setTimeout after the time has expired, thats why we have a
        // third param
        function f(a, b, push) {
          // check if the time has expired,
          // after __animationDuration expires don't take anymore requests
          if (this.timedOut && typeof(push) == "undefined") {
            return 0;
          } else {
            // If push is there, never clear that interval
            // so never add it to the registry
            if (push) {
              return oldSetTimeout(a,b);
            } else {
              return registered[ registered.length ] = oldSetTimeout(a,b);
            }
          }
        }

        f.clearAll = function() {
          var r;

          while (r = registered.pop()) {
            clearTimeout( r );
          }

          this.timedOut = true;
        };

        f.timedOut = false;

        return f;
      }(window.setTimeout));

      setTimeout(function() {

        setTimeout.clearAll();
        setInterval.clearAll();

        // Stop Web Animations API
        // Idea from Gregor: https://github.com/CodePen/CodePen-Bug-Reporting-Only/issues/173#issuecomment-203443301
        // Status as of August 2016:
        //  Chrome = stops animations
        //  Safari = doesn't support anyway
        //  Firefox = doesn't stop them, but probably will someday? Doesn't error
        if (document.timeline && typeof document.timeline.getAnimations === "function") {
          document.timeline.getAnimations().map(function(animation) {
            animation.pause();
          });
        }
    
      }, __animationDuration, "push");

    }());
  </script>

    <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>

  </head>

  <body translate="no"  onload="_l='t';">

    <div class="container" ng-app="sortApp" ng-controller="mainController">
  
  <div >
    
  </div>
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search your products" ng-model="searchFish">
      </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
        <td>
          <a href="#" ng-click="sortType = 'model'; sortReverse = !sortReverse">
            Mobile Model
            <span ng-show="sortType == 'model' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == model' && sortReverse" class="fa fa-caret-up"></span>
          
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'version'; sortReverse = !sortReverse">
          OS Version 
            <span ng-show="sortType == 'version' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'version' && sortReverse" class="fa fa-caret-up"></span>
          
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'price'; sortReverse = !sortReverse">
          Price 
            <span ng-show="sortType == 'price' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'price' && sortReverse" class="fa fa-caret-up"></span>
            
          </a>
        </td>
        <td>
                Details
        
        </td>
      </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="roll in sushi | orderBy:sortType:sortReverse | filter:searchFish">
        <td>{{ roll.model }}</td>
        <td>{{ roll.version }}</td>
        <td>{{ roll.price }}</td>
        <td> <a class="popup-trigger">
        <button type="button" class="btn btn-info">
    <span class="glyphicon glyphicon-info"></span> Search
  </button></a> 
  <div class="popup">
      Madrid is a city in Europe and the capital and largest city of Spain. The population of the city is almost 3.2 million and that of the Madrid metropolitan area, around 6.3 million. <br><br>It is the third-largest city in the European Union, after London and Berlin, and its metropolitan area is the third-largest in the European Union after Paris and London. The city spans a total of 604.3 km2 (233.3 sq mi).
      <span class="popup-btn-close">close</span>
    </div>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    
    <script>
    // Popup Window
    var scrollTop = '';
    var newHeight = '100';

    $(window).bind('scroll', function() {
       scrollTop = $( window ).scrollTop();
       newHeight = scrollTop + 100;
    });
    
    $('.popup-trigger').click(function(e) {
       e.stopPropagation();
     if(jQuery(window).width() < 767) {
       $(this).after( $( ".popup" ) );
       $('.popup').show().addClass('popup-mobile').css('top', 0);
       $('html, body').animate({
        scrollTop: $('.popup').offset().top
      }, 500);   
     } else {
       $('.popup').removeClass('popup-mobile').css('top', newHeight).toggle();
     };
    });
    
    $('html').click(function() {
     $('.popup').hide();
    });

    $('.popup-btn-close').click(function(e){
      $('.popup').hide();
    });

    $('.popup').click(function(e){
      e.stopPropagation();
    });
    </script></td>
      </tr>
    </tbody>
    
  </table>
  
  <p class="text-center text-muted">
    
  </p>
  
  <p class="text-center">
    
  </p>
  
</div>
    

      <script src="//assets.codepen.io/assets/common/stopExecutionOnTimeout-53beeb1a007ec32040abaf4c9385ebfc.js"></script>

    <script src='//ajax.googleapis.com/ajax/libs/angularjs/1.3.2/angular.min.js'></script>

        <script>
      angular.module('sortApp', []).controller('mainController', function ($scope) {
    $scope.sortType = 'model';
    $scope.sortReverse = false;
    $scope.searchFish = '';
    $scope.sushi = [
        {
            model: 'Oppo F1S',
            version: 'Android 4.4.3',
            price: 25000
            
        },
        {
            model: 'Lenovo note K3',
            version: 'Android 4.7',
            price: 29000
        },
        {
            model: 'Apple 6s',
            version: 'ios',
            price: 72000
        },
        {
            model: 'HTC Desire Eye',
            version: '4.6.7',
           price: 39000
        }
    ];
});
      //# sourceURL=pen.js
    </script>

      <script>
  (function() {

    setTimeout(function() {
      // If onload hasn't been called, stop all requests after 2 seconds
      if (typeof(_l) == "undefined") {
        if (window.stop !== undefined) window.stop();
        else if (document.execCommand !== undefined) document.execCommand("Stop", false);
      }
    }, 2000, "push");

    /*
    * Capture and kill CSS animations after X number of seconds
    */
    function pauseAnimations() {
      var body = document.getElementsByTagName("body")[0];

      if (body.addEventListener) {
        body.addEventListener("webkitAnimationStart", listener, false);
        body.addEventListener("webkitAnimationIteration", listener, false);
        body.addEventListener("animationstart", listener, false);
        body.addEventListener("animationiteration", listener, false);
      }
    }

    function listener(e) {

      var targetEl;

      if (e.type == "webkitAnimationStart" || e.type == "webkitAnimationIteration") {

        targetEl = e.target;

        setTimeout(function() {
          targetEl.style.webkitAnimationPlayState = "paused";
        }, __animationDuration, "push");

      } else if (e.type == "animationstart" || e.type == "animationiteration") {

        targetEl = e.target;

        setTimeout(function() {
          targetEl.style.MozAnimationPlayState = "paused";
        }, __animationDuration, 'push');
        
      }
    }

    pauseAnimations();

    // Pause all audio elements, allow the audio/video
    // elements to render before stopping them
    function pauseElementTypes(type) {
      for (var i = 0, els = document.getElementsByTagName(type); i < els.length; i++) {
        els[i].pause();
      }
    }

    // Wait until the elements have been created to pause them
    setTimeout(function() {
      pauseElementTypes("audio");
      pauseElementTypes("video");
    }, 100);

  }());
  </script>
   </body>
</html>
 
