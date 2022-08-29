const express = require("express");
const bodyParser = require("body-parser");
const port = 3000;

const app = express();

app.get("/", (req, res) => {
    res.send("hello");
});

app.listen(port, () => {
    console.log("server is running on port" + port)
});