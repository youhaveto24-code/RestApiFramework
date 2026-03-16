package api.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    //DataProvider 1 passing data to another test

    @DataProvider(name="Data")
    public String [][] getData() throws IOException
    {
        String path=  "/Users/raj/IdeaProjects/RestAssuredAPI_Framework/testData/Userdata.xlsx"; //taking xl file from testData

        XLUtility xl=new XLUtility(path);//creating an object for XLUtility

        int rownum=xl.getRowCount("UserData");
        int colcount=xl.getCellCount("UserData",1);

        String apidata[][]=new String[rownum][colcount];//created for two dimension array which can store the data user and password

        for(int i=1;i<=rownum;i++)  //1   //read the data from xl storing in two deminsional array
        {
            for(int j=0;j<colcount;j++)  //0    i is rows j is col
            {
                apidata[i-1][j]= xl.getCellData("UserData",i, j);  //1,0
            }
        }
        return apidata;//returning two dimension array

    }

    @DataProvider(name="UserNames")
    public String[] getUserNames() throws IOException
    {
        String path = "/Users/raj/IdeaProjects/RestAssuredAPI_Framework/testData/Userdata.xlsx";
        XLUtility xl = new XLUtility(path);

        int rownum = xl.getRowCount("UserData");

        String apidata[] = new String[rownum];

        for(int i = 1; i <= rownum; i++)
        {
            apidata[i-1] = xl.getCellData("UserData", i, 1);
        }

        return apidata;
    }



}