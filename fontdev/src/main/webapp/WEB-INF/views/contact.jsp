
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex">

    <title>contact</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/my.css">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="css/demo.css">
	<link rel="stylesheet" href="css/footer-basic-centered.css">
	<link rel="stylesheet" href="./resources/crunchify.css">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
    .contact-form {
    margin-top:70px;
}
    </style>
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
        });
    </script>
</head>
<body>
<jsp:include page="header.jsp"/>
	<section class="content">
            <div class="container">
<div class="row">
<div class="col-sm-4">
<div class="col-xs-12" style="height:50px;"></div>
<div class="col-xs-12" style="height:50px;"></div>

<h3>HS Tech Support </h3>
<hr>
<address>

<strong>USA address:</strong> eNest LLC 4809, E Thistle Landing, Dr. Suit 100 AZ 85044 USA ,<br>
<strong>Phone:</strong> +1-888-414-6658 
</address>

<address>
<strong>Germany Address:</strong>  (Haftungsbeschraenkt/Limited-Liability), Morsering 2, Munich 80937 Germany , <br>
<strong>Phone:</strong> +49 151 2757 2810
</address>
</div>
    
<div class="col-sm-8 contact-form">
<div class="col-xs-12" style="height:50px;"></div>
<div class="col-xs-12" style="height:50px;"></div>
<form id="contact" method="post" class="form" role="form">
<div class="row">
<div class="col-xs-6 col-md-6 form-group">
<input class="form-control" id="name" name="name" placeholder="Name" type="text" required autofocus />
</div>
<div class="col-xs-6 col-md-6 form-group">
<input class="form-control" id="email" name="email" placeholder="Email" type="email" required />
</div>
</div>
<textarea class="form-control" id="message" name="message" placeholder="Message" rows="5"></textarea>
<br />
<div class="row"></div>
<div class="col-xs-12 col-md-12 form-group"></div>
<button class="btn btn-primary pull-right" type="submit">Submit</button>
</form>
</div>
</div>
</div>


<div class="col-xs-12" style="height:50px;"></div>
	<div class="col-xs-12" style="height:50px;"></div>
	<div class="col-xs-12" style="height:50px;"></div>
	
        </section>
	<script type="text/javascript">
	
	</script>
	
	<jsp:include page="footer.jsp"/>
	
</body>
</html>
