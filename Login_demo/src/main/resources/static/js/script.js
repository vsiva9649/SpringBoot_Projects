document.getElementById("loginForm").addEventListener("submit", function(event) {
  event.preventDefault();

  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;
  const messageElement = document.getElementById("message");

  // Replace this with your own login logic
  if (username === "user" && password === "password") {
    messageElement.innerText = "Login successful!";
  } else {
    messageElement.innerText = "Invalid username or password.";
  }
});
