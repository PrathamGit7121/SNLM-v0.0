﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="DMHS.WebForm1" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="LOGINCSS.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
    <title>Login page</title>
</head>
<body>
    <section class="side">
        <img src="images/img.svg" alt="">
    </section>

    <section class="main">
        <div class="login-container">
            <p class="title">Welcome back</p>
            <div class="separator"></div>
            <p class="welcome-message">Please, provide login credential to proceed and have access to all services</p>

            <form class="login-form" runat="server">
                <div class="form-control">
                    <input type="text" placeholder="Username">
                    <i class="fas fa-user"></i>
                </div>
                <div class="form-control">
                    <input type="password" placeholder="Password">
                    <i class="fas fa-lock"></i>
                </div>
                <asp:Button ID="Button1" runat="server" Text="Login" OnClick="Button1_Click" CssClass="submit"/>
            </form>
        </div>
    </section>
    
</body>
</html>

        
    
