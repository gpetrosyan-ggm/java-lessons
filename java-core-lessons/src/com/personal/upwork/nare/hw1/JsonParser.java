package com.personal.upwork.nare.hw1;

import java.util.ArrayList;

public class JsonParser {
//
//    private JSONObject jsonObject;
//
    public JsonParser(String path) {
//        try {
//            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    public ArrayList<Employee> getEmployees() {
//        JSONArray jsonArray = (JSONArray) jsonObject.get("Full");
//        Iterator iterator = jsonArray.iterator();
        ArrayList<Employee> employees = new ArrayList<>();
//
//        while (iterator.hasNext()) {
//            JSONObject tempJson = (JSONObject) iterator.next();
//            String name = (String) tempJson.get("FirstName");
//            String surname = (String) tempJson.get("LastName");
//            int id = Integer.parseInt((String) tempJson.get("ID"));
//            String work = (String) tempJson.get("Work");
//            Employee employee = null;
//            switch (work) {
//                case "Software Manager":
//                    employee = new SWManager(name, surname, id);
//                    break;
//                case "Software Engineer":
//                    employee = new SWEngineer(name, surname, id);
//                    break;
//                case "Accountant":
//                    employee = new Accountant(name, surname, id);
//                    break;
//                case "Finance Manager":
//                    employee = new FinanceManager(name, surname, id);
//                    break;
//            }
//            employees.add(employee);
//        }
        return employees;
    }


}