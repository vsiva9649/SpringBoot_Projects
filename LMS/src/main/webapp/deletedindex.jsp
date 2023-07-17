<html>
<head>
<title>DeleteBook</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="/css/delete.css" rel="stylesheet">

</head>

<body>

<h1 > DELETE BOOK INFORMATION</h1>
<br><br>
<div id="form" class="container min-vh-50 d-flex justify-content-center">
<form action="DeleteBookDetails">
  
<div class="form-group">
<label id="here"for="isbn">Enter ISBN for the Book </label>
<br>
<input type="text" id="isbn" name="isbn" pattern="[0-9]" title="Enter a valid ISBN Numbers Only." required>

<div class="mx-auto text-center">
<button type="submit" id="submit" class="btn btn-primary"> Delete Book</button>
</div>
</div>
</div>
</form>
</body>
</html>