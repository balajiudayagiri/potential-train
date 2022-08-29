const { response } = require("express");
const express = require("express");
const https = require("https");
const bodyParser = require("body-parser");
const app = express();
const port = 3000;
app.use(bodyParser.urlencoded({ extended: true }));
app.get("/", (req, res) => {
    res.sendFile(__dirname + "/index.html");
})
app.post("/", (req, res) => {
    const city = req.body.cityName;
    const url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=c16010ef1ac3983028bab6d1d5bc1a0a&units=metric";
    https.get(url, (response) => {
        console.log(response.statusCode);
        response.on("data", (data) => {
            const weatherData = JSON.parse(data);
            const temp = weatherData.main.temp;
            const des = weatherData.weather[0].description;
            const mai = weatherData.weather[0].main;
            const icon = weatherData.weather[0].icon;
            const imageURL = "http://openweathermap.org/img/wn/" + icon + "@2x.png";
            res.write("<html>");
            res.write("<p><strong>In " + city + " the weather currently " + des + ", and it currently  " + mai + ".</strong></p>");
            res.write("<h1>The temp is " + temp + " Degree celcius.</h1>");
            res.write("<img src=" + imageURL + ">");
            res.write("</html>");
            res.send()
        })
    })
})
app.listen(port, () => {
    console.log("server is running on port http://localhost:" + port);
})

