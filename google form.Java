// Get the form element
const form = document.getElementById("registration-form");

// Add an event listener to the form submit event
form.addEventListener("submit", function(event) {
  // Get the form input values
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;
  const confirmPassword = document.getElementById("confirm-password").value;

  // Check if the name input is empty
  if (name.trim() === "") {
    alert("Name field is required.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the email input is empty
  if (email.trim() === "") {
    alert("Email field is required.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the email is valid
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    alert("Please enter a valid email address.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the password input is empty
  if (password.trim() === "") {
    alert("Password field is required.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the password is at least 8 characters long
  if (password.length < 8) {
    alert("Password must be at least 8 characters long.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the confirm password input is empty
  if (confirmPassword.trim() === "") {
    alert("Confirm password field is required.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }

  // Check if the password and confirm password inputs match
  if (password !== confirmPassword) {
    alert("Passwords do not match.");
    event.preventDefault(); // Prevent the form from submitting
    return;
  }
});
