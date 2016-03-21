# layout-demo

A Thymeleaf layout demo showing Thymeleaf variables being passed and substituted at runtime.

Usage: mvnw spring-boot:run

Browse to localhost:8080

Click the header links and notice the home page link is bold when you're on the home page, and similar for the about page.

The home and about pages in templates uses the templates/layout/default.html which includes a header from templates/partial/header.html.

Notice the home.html/about.html templates set a Thymeleaf variable used by the header.html template.
