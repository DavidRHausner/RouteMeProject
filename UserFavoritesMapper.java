// Template for this code found at http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBMapper.html
// Class written by Patrick Laflin
// Class written on 4/3/2016

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="UserFavorites")
public class UserFavoritesMapper {
    
    private Integer UserID;
    private String Location1;
    private String Location2;
    private String Location3;
    private String Location4;
    private String Location5;
    
    @DynamoDBHashKey(attributeName="UserID")  
    public Integer getUserID() { return UserID;}
    public void setUserID(Integer UserID) {this.UserID = UserID;}
    
    @DynamoDBAttribute(attributeName="Location 1")  
    public String getLocation1() {return Location1; }
    public void setLocation1(String Location1) { this.Location1 = Location1; }
    
    @DynamoDBAttribute(attributeName="Location 2")  
    public String getLocation2() { return Location2; }
    public void setLocation2(String Location2) { this.Location2 = Location2; }
    
    @DynamoDBAttribute(attributeName = "Location 3")
    public String getLocation3() { return Location3; }
    public void setLocation3(String Location3) { this.Location3 = Location3; }
    
    @DynamoDBAttribute(attributeName = "Location 4")
    public String getLocation4() { return Location4; }
    public void setLocation4(String Location4) { this.Location4 = Location4; }
    
    @DynamoDBAttribute(attributeName = "Location 5")
    public String getLocation5() { return Location5; }
    public void setLocation5(String Location5) { this.Location5 = Location5; }
}
