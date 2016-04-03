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

public class AddUserRoutes {

    public static void main(String[] args) throws Exception {

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(
        		new ProfileCredentialsProvider());

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("UserRoutes");

        int UserID = 0;							
        String Route1 = "NULL"; 
        String Route2 = "NULL";
        String Route3 = "NULL";
        String Route4 = "NULL";
        String Route5 = "NULL";
        
        try {
            System.out.println("Adding a new item...");
            PutItemOutcome outcome = table.putItem(new Item()
                .withPrimaryKey("UserID", UserID)
                .withString("Route 1", Route1)
                .withString("Route 2", Route2)
                .withString("Route 3", Route3)
                .withString("Route 4", Route4)
                .withString("Route 5", Route5));
            
            System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());

        } catch (Exception e) {
            System.err.println("Unable to add item: " + UserID);
            System.err.println(e.getMessage());
        }

    }
}
