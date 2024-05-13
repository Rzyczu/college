package Engine;

import Enums.*;
import People.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

    private static Workbook getWorkbook(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        return new XSSFWorkbook(fileInputStream);
    }

    private static void closeWorkbook(Workbook workbook, FileInputStream fileInputStream) throws IOException {
        workbook.close();
        if (fileInputStream != null) {
            fileInputStream.close();
        }
    }

    private static String getStringCellValue(Cell cell) {
        return cell.getStringCellValue().trim();
    }

    private static String getPhoneCellValue(Cell cell) {
        if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf((long) cell.getNumericCellValue());
        } else {
            return cell.getStringCellValue();
        }
    }

    private static Double getNumericCellValue(Cell cell) {
        if (cell.getCellType() == CellType.NUMERIC) {
            return cell.getNumericCellValue();
        } else if (cell.getCellType() == CellType.STRING) {
            return Double.parseDouble(cell.getStringCellValue());
        } else {
            throw new IllegalStateException("Cell type is not numeric or string");
        }
    }

    private static Date getDateCellValue(Cell cell) throws ParseException {
        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            return cell.getDateCellValue();
        } else {
            throw new ParseException("Cell does not contain a valid date", 0);
        }
    }

    public static List<Student> readStudentsFromExcel(String filePath) throws IOException, ParseException {
        List<Student> students = new ArrayList<>();
        Workbook workbook = getWorkbook(filePath);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header row
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String name = getStringCellValue(row.getCell(0));
            String surname = getStringCellValue(row.getCell(1));
            Gender gender = Gender.valueOf(getStringCellValue(row.getCell(2)).toUpperCase());
            String personalCode = getStringCellValue(row.getCell(3));
            Date birthDate = getDateCellValue(row.getCell(4));
            String email = getStringCellValue(row.getCell(5));
            String phone = getPhoneCellValue(row.getCell(6));
            String address = getStringCellValue(row.getCell(7));
            String city = getStringCellValue(row.getCell(8));
            String country = getStringCellValue(row.getCell(9));
            int studentId = (int) row.getCell(10).getNumericCellValue();
            Student student = new Student(name, surname, gender, personalCode, birthDate, email, phone, address, city, country, studentId);
            students.add(student);
        }
        closeWorkbook(workbook, null);
        return students;
    }

    public static List<Personnel> readPersonnelFromExcel(String filePath) throws IOException, ParseException {
        List<Personnel> personnelList = new ArrayList<>();
        Workbook workbook = getWorkbook(filePath);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header row
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String name = getStringCellValue(row.getCell(0));
            String surname = getStringCellValue(row.getCell(1));
            Gender gender = Gender.valueOf(getStringCellValue(row.getCell(2)).toUpperCase());
            String personalCode = getStringCellValue(row.getCell(3));
            Date birthDate = getDateCellValue(row.getCell(4));
            String email = getStringCellValue(row.getCell(5));
            String phone = getPhoneCellValue(row.getCell(6));
            String address = getStringCellValue(row.getCell(7));
            String city = getStringCellValue(row.getCell(8));
            String country = getStringCellValue(row.getCell(9));
            Double salary = getNumericCellValue(row.getCell(10));
            WorkField workField = WorkField.valueOf(getStringCellValue(row.getCell(11)).toUpperCase());
            Personnel personnel = new Personnel(name, surname, gender, personalCode, birthDate, email, phone, address, city, country, salary, workField);
            personnelList.add(personnel);
        }
        closeWorkbook(workbook, null);
        return personnelList;
    }

    public static List<Professor> readProfessorFromExcel(String filePath) throws IOException, ParseException {
        List<Professor> professorList = new ArrayList<>();
        Workbook workbook = getWorkbook(filePath);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header row
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String name = getStringCellValue(row.getCell(0));
            String surname = getStringCellValue(row.getCell(1));
            Gender gender = Gender.valueOf(getStringCellValue(row.getCell(2)).toUpperCase());
            String personalCode = getStringCellValue(row.getCell(3));
            Date birthDate = getDateCellValue(row.getCell(4));
            String email = getStringCellValue(row.getCell(5));
            String phone = getPhoneCellValue(row.getCell(6));
            String address = getStringCellValue(row.getCell(7));
            String city = getStringCellValue(row.getCell(8));
            String country = getStringCellValue(row.getCell(9));
            Double salary = getNumericCellValue(row.getCell(10));
            Professorship professorship = Professorship.valueOf(getStringCellValue(row.getCell(11)).toUpperCase().replaceAll("\\s+", "_"));
            Degree degree = Degree.fromFullName(getStringCellValue(row.getCell(12)).toUpperCase().replaceAll("\\s+", ""));
            Professor professor = new Professor(name, surname, gender, personalCode, birthDate, email, phone, address, city, country, salary, professorship, degree);
            professorList.add(professor);
        }
        closeWorkbook(workbook, null);
        return professorList;
    }
}
