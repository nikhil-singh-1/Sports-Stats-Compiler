
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException{
		File excelFile = new File("/eclipse-workspace/Read Excel/Resource/Example Book.xlsx"); //Right click on file, then properties & copy the location
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIt = sheet.iterator();
		
		PlayerBlock playerBlock1 = new SimplePlayerBlock();
		
		while (rowIt.hasNext()) {
			Row row = rowIt.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				PlayerStats stats1 = new SimplePlayerStats();
				stats1.setGameNumber(Double.parseDouble(cellIterator.next().toString()));
				stats1.setDate(cellIterator.next().toString());
				stats1.setAge(cellIterator.next().toString());
				stats1.setTeam(cellIterator.next().toString());
				stats1.setOpponent(cellIterator.next().toString());
				stats1.setSpread(cellIterator.next().toString());
				stats1.setMinutePlayed(cellIterator.next().toString());
				stats1.setFieldGoalMade(Double.parseDouble(cellIterator.next().toString()));
				stats1.setFieldGoalAttempted(Double.parseDouble(cellIterator.next().toString()));
				stats1.setFieldGoalPercentage(Double.parseDouble(cellIterator.next().toString()));
				stats1.setThreePointMade(Double.parseDouble(cellIterator.next().toString()));
				stats1.setThreePointAttempted(Double.parseDouble(cellIterator.next().toString()));
				stats1.setThreePointPercentage(Double.parseDouble(cellIterator.next().toString()));
				stats1.setFreeThrowMade(Double.parseDouble(cellIterator.next().toString()));
				stats1.setFreeThrowAttempted(Double.parseDouble(cellIterator.next().toString()));
				stats1.setFreeThrowPercentage(Double.parseDouble(cellIterator.next().toString()));
				stats1.setOffensiveRebound(Double.parseDouble(cellIterator.next().toString()));
				stats1.setDefensiveRebound(Double.parseDouble(cellIterator.next().toString()));
				stats1.setTotalRebound(Double.parseDouble(cellIterator.next().toString()));
				stats1.setAssist(Double.parseDouble(cellIterator.next().toString()));
				stats1.setSteal(Double.parseDouble(cellIterator.next().toString()));
				stats1.setBlock(Double.parseDouble(cellIterator.next().toString()));
				stats1.setTurnover(Double.parseDouble(cellIterator.next().toString()));
				stats1.setPersonalFoul(Double.parseDouble(cellIterator.next().toString()));
				stats1.setPoint(Double.parseDouble(cellIterator.next().toString()));
				stats1.SetPlusMinus(Double.parseDouble(cellIterator.next().toString()));
				playerBlock1.addPlayerStats(stats1);
			}
		}
		workbook.close();
		fis.close();
		System.out.println(playerBlock1.getStats().getAssist());
		System.out.println(playerBlock1.getStats().getAssist());
		System.out.println(playerBlock1.getStats().getAssist());
	}
}
