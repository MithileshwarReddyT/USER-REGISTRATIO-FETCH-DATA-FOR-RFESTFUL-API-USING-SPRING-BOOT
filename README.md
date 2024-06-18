HERE I WILL EXPLAIN STEP BY STEP PROCESS TO RUN THE APPLICATION
1- DOWNLOAD THIS AS A ZIP FILE AND EXTRACT ALL
2-OPEN VS CODE ,IN VS CODE IN FILE SELCT OPEN FOLDER AND SELECT THE UNZIIPED FOLDER OR PROJECT.
3-TO RUN THIS U SHOULD HAVE MAVEN LATEST VERSION,JDK-22.
4-RIGHT CLICK ON src/main/java/com/example/userregistration/UserregistrationApplication.java to run project.
5-THEN OPEN POSTMAN API 
Open Postman:
Open the Postman application.
Create a New Request:
Click on the + button to open a new tab.
Set the request type to POST.
Enter the request URL: http://localhost:8080/api/user/register.
Set Body:
In the "Body" tab, select raw and set the format to JSON.
Enter the following JSON to register a new user:
json
copy the code below or enter anything by yourself
{
  "username": "xavier",
  "email": "xavier@example.com",
  "password": "1987pass123"
} and click send you will get output as
<img width="701" alt="image" src="https://github.com/MithileshwarReddyT/USER-REGISTRATIO-FETCH-DATA-FOR-RFESTFUL-API-USING-SPRING-BOOT/assets/103414606/5e1040f3-886a-47e3-9ba8-a74aa3b8c616">
Test the Fetch User Endpoint
Create a New Request
Click on the + button to open a new tab.
Set the request type to GET.
Enter the request URL: http://localhost:8080/api/user/fetch?username=xavier.
Send Request:
Click the Send button.
You should receive a response with the user details if the user is found, or a 404 Not Found status if the user does not exist.
Like this by following mentioned steps you can run the application


