// Template for this code found at http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBMapper.html
// Class written by Patrick Laflin
// Class written on 4/3/2016

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="UserRoutes")
public class UserRoutesMapper {
    
    private Integer UserID;
    private String Route1;
    private String Route2;
    private String Route3;
    private String Route4;
    private String Route5;
    
    @DynamoDBHashKey(attributeName="UserID")  
    public Integer getUserID() { return UserID;}
    public void setUserID(Integer UserID) {this.UserID = UserID;}
    
    @DynamoDBAttribute(attributeName="Route 1")  
    public String getRoute1() {return Route1; }
    public void setRoute1(String Route1) { this.Route1 = Route1; }
    
    @DynamoDBAttribute(attributeName="Route 2")  
    public String getRoute2() {return Route2; }
    public void setRoute2(String Route2) { this.Route2 = Route2; }
    
    @DynamoDBAttribute(attributeName="Route 3")  
    public String getRoute3() {return Route3; }
    public void setRoute3(String Route3) { this.Route3 = Route3; }
    
    @DynamoDBAttribute(attributeName="Route 4")  
    public String getRoute4() {return Route4; }
    public void setRoute4(String Route4) { this.Route4 = Route4; }
    
    @DynamoDBAttribute(attributeName="Route 5")  
    public String getRoute5() {return Route5; }
    public void setRoute5(String Route5) { this.Route5 = Route5; }
}

