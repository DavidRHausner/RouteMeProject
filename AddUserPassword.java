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

public class AddUserPassword {

    public static void main(String[] args) throws Exception {

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(
        		new ProfileCredentialsProvider());

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("UserLogin");

        int UserID = 0;							
        String UserName = "Patrick Laflin"; 
        int UserPassword = 18924;

        try {
            System.out.println("Adding a new item...");
            PutItemOutcome outcome = table.putItem(new Item()
                .withPrimaryKey("UserID", UserID)
                .withString("User Name", UserName)
                .withNumber("User Password", UserPassword));
            
            System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());

        } catch (Exception e) {
            System.err.println("Unable to add item: " + UserID + " " + UserName);
            System.err.println(e.getMessage());
        }

    }
}