package utilities;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtil {

    public static Object[][] getLoginData(){

        Object[][] data = null;

        try{

            FileInputStream file =
                    new FileInputStream("src/main/resources/testdata.xlsx");

            Workbook workbook = WorkbookFactory.create(file);

            Sheet sheet = workbook.getSheet("Login");

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows-1][cols];

            for(int i=1;i<rows;i++){

                for(int j=0;j<cols;j++){

                    data[i-1][j] =
                            sheet.getRow(i).getCell(j).toString();
                }
            }

            workbook.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return data;
    }
}