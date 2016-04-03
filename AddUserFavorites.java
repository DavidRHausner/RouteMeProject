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

public class AddUserFavorites {

    public static void main(String[] args) throws Exception {

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(
        		new ProfileCredentialsProvider());

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("UserFavorites");

        int UserID = 0;							
        String Location1 = "NULL"; 
        String Location2 = "NULL";
        String Location3 = "NULL";
        String Location4 = "NULL";
        String Location5 = "NULL";
        
        try {
            System.out.println("Adding a new item...");
            PutItemOutcome outcome = table.putItem(new Item()
                .withPrimaryKey("UserID", UserID)
                .withString("Location 1", Location1)
                .withString("Location 2", Location2)
                .withString("Location 3", Location3)
                .withString("Location 4", Location4)
                .withString("Location 5", Location5));
            
            System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());

        } catch (Exception e) {
            System.err.println("Unable to add item: " + UserID);
            System.err.println(e.getMessage());
        }

    }
}

