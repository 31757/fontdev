<!DOCTYPE html>
<html lang="en-US">

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="robots" content="all,index,follow" />

    <title>Create Mobile Optimized Modal Window</title>
    <meta name="description" content="Code a basic responsive popup window without using a plugin, that works great on desktop and mobile." />

    <style>
    .popup-trigger { display: block; margin: 0 auto; padding: 20px; max-width: 260px; background: #4EBD79; color: #fff;
                 font-size: 18px; font-weight: 700; text-align: center; text-transform: uppercase; line-height: 24px; cursor: pointer; }
        .popup {display: none; position: absolute; top: 100px; left: 50%; width: 700px; margin-left: -350px; padding: 50px 30px;
            background: #fff; color: #333; font-size: 19px; line-height: 30px; border: 10px solid #150E2D; z-index: 9999;}
        .popup-mobile {position: relative; top: 0; left: 0; margin: 30px 0 0; width: 100%;}   
          .popup-btn-close {position: absolute; top: 8px; right: 14px; color: #4EBD79; font-size: 14px; font-weight: bold; text-transform: uppercase; cursor: pointer;} 
      </style>
       </head>

  <body>
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
    </script>
  </body>
</html>