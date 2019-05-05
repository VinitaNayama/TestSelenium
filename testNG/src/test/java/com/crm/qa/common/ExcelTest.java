package com.crm.qa.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	static Workbook workbook;

	public static void loadWorkBook(String completeFilePath) {
		try {
			InputStream inputStream = new FileInputStream(completeFilePath);
			workbook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Object[][] getTestData(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);
		int totalRows = sheet.getLastRowNum();
		Object[][] data = new Object[totalRows][1];

		for (int row = 0; row < totalRows; row++) {
			Row keyRow = sheet.getRow(0);
			Row valueRow = sheet.getRow(row+1);

			Map<String, String> map = new LinkedHashMap<String, String>();
			int totalColumns = keyRow.getLastCellNum();

			for (int column = 0; column < totalColumns; column++ ) {
				String key = cellValue(keyRow.getCell(column));
				String value = cellValue(valueRow.getCell(column));
				map.put(key, value);
			}
			data[row][0]= map;
		}
		return data;
	}

	public static String cellValue(Cell cell) {
		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
		CellValue cellValue = evaluator.evaluate(cell);

		switch (cellValue.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell))
				return cell.getDateCellValue()+"";
			else
				return cell.getNumericCellValue()+"";
		case BOOLEAN:
			return cell.getBooleanCellValue()+"";
		default:
			return cell.getStringCellValue()+"";
		}
	}
}