<html>
<head>

</head>

<body>
<form action="UpdateBookDetails">
<h1>UPDATE BOOK INFORMATION</h1>
<label for="bname"> The Book Name :</label>
<input type="text" id="bname" name="bname" title="please enter your valid name" required>
<br>
<label for="aname"> The Name of Author(s) :</label>
<input type="text" id="aname" name="aname"   title="please enter your valid name" required>
<br>
<label for ="bookcategory">Select Book Category :</label>
<select name ="category" id= "category">
<option value="Classics">Classics</option>
<option value="Fantasy">Fantasy</option>
<option value="Tragedy">Tragedy</option>
<option value="Sci-fi ">Sci-Fi</option>
<option value="Action and Adventure">Action and Adventure</option>
<option value="Crime & Mystery">Crime & Mystery</option>
<option value="Romance">Romance</option>
<option value="Humor and Satire">Humor and Satire</option>
<option value="Horror">Horror</option>
<option value="Comics">Comics</option>
<option value="Biography and Autobiography">Biography and Autobiography</option>
<option value="Memoirs">Memoirs</option>
<option value="CookBooks">Cookbooks</option>
<option value="True Stories">True Stories</option>
<option value="Self Help">Self Help</option>
<option value="Love">Love</option>
<option value="Studies Books">Studies Books</option>
<option value="Spoken English">Spoken English</option>
<option value="Tamil Books">Tamil Books</option>
</select>
<br>
<label for="pname"> The Name of the Publisher :</label>
<input type="text" id="pname" name="pname">
<br>
<label for="edition">The Edition number :</label>
<input type="text" id="edition" name="edition">
<br>
<label for="pages">The number of Pages :</label>
<input type="text" id="pages" name="pages">
<br>
<label for="isbn">ISBN for the Book :</label>
<input type="text" id="isbn" name="isbn">
<br>
<button type="submit"> Update Book</button>

</form>
</body>
</html>