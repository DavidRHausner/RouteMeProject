// Copyright 2012-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// Licensed under the Apache License, Version 2.0.

// Adding Password to the User Login Table for RouteMe
// Created by Patrick Laflin
// Created on 04/02/2016

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class AddUserInfo {

    public static void main(String[] args) throws Exception {

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(
        		new ProfileCredentialsProvider());

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("UserInfo");

        int UserID = 0;							
        String FirstName = "Patrick"; 
        String LastName = "Laflin";
        String PhoneNumber = "(850)276-3816";
        String StreetAddressLine1 = "118 E Lakeshore Drive";
        String StreetAddressLine2 = "Unit B";
        String City = "Panama City Beach";
        String State = "FL";
        int ZipCode = 32413;
        String EmailAddress = "pbl14@my.fsu.edu";
        

        try {
            System.out.println("Adding a new item...");
            PutItemOutcome outcome = table.putItem(new Item()
                .withPrimaryKey("UserID", UserID)
                .withString("First Name", FirstName)
                .withString("Last Name", LastName)
                .withString("Phone Number", PhoneNumber)
                .withString("Street Address Line 1", StreetAddressLine1)
                .withString("Street Address Line 2", StreetAddressLine2)
                .withString("City", City)
                .withString("State", State)
                .withNumber("Zip Code", ZipCode)
                .withString("Email Address", EmailAddress));
            
            System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());

        } catch (Exception e) {
            System.err.println("Unable to add item: " + UserID);
            System.err.println(e.getMessage());
        }

    }
}