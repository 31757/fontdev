<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div>
<jsp:include page="header.jsp"/>
</div>
<div class="container">
  <h2>Condensed Table</h2>
  <p> </p>
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>Computer</th>
        <th>Laptop</th>
        <th>Mobiles</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><a href="computer.jsp"><img src="./resources/images/Koala.jpg" alt="Go to W3Schools!" width="150" height=150" border="0">
</a></td>
        <td><a href="laptop.jsp"><img src="./resources/images/Chrysanthemum.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
        <td><a href="mobiles.jsp"><img src="./resources/images/Hydrangeas.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
      </tr>
      </tbody>
      <thead>
      <tr>
        <th>Television</th>
        <th>Telephones</th>
        <th>Regrigerators</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><a href="computer.jsp"><img src="./resources/images/Jellyfish.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
        <td><a href="Telephones.jsp"><img src="./resources/images/Lighthouse.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
        <td><a href="refrigerators.jsp"><img src="./resources/images/Penguins.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
      </tr>
      </tbody>
      <thead>
       <tr>
        <th>Sewing Machines</th>
        <th>Power Banks</th>
        <th>Laptop Computer Accessories</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><a href="sewingmachines.jsp"><img src="./resources/images/Tulips.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
        <td><a href="powerbanks.jsp"><img src="./resources/images/Koala.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
        <td><a href="laptopcompaccessories.jsp"><img src="./resources/images/Desert.jpg" alt="Go to W3Schools!" width="150" height="150" border="0">
</a></td>
      </tr>
    </tbody>
  </table>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>

