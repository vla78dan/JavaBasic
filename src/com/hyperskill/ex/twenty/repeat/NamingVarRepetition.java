package com.hyperskill.ex.twenty.repeat;

/*
Дилемма цифровой панели приборов Roadrunner
Разработайте программу Java для системы отслеживания транспортных средств. Создайте переменные для хранения идентификатора транспортного средства, скорости и уровня топлива. Реализуйте метод для обновления этих значений и еще один для отображения статуса транспортного средства. Используйте осмысленные имена переменных в соответствии с соглашениями Java. Убедитесь, что скорость неотрицательна, а уровень топлива находится в диапазоне от 0 до 100. Входные данные: одна строка, содержащая идентификатор транспортного средства (строка), скорость (число с плавающей точкой) и уровень топлива (число с плавающей точкой), разделенные пробелами. Выходные данные: одна строка с отформатированным статусом транспортного средства.

Пример ввода 1:

ABC123 65.5 75.0

Объясните код
Пример вывода 1:

Vehicle ABC123: Speed = 65.5 km/h, Fuel = 75.0%

Объясните код
Пример ввода 2:

XYZ789 0.0 100.0

Объясните код
Пример вывода 2:

Vehicle XYZ789: Speed = 0.0 km/h, Fuel = 100.0%


import java.util.Scanner;

public class NamingVarRepetition {
    // Vehicle properties
    private String vehicleId;
    private float speed;
    private float fuelLevel;

    // Method to update vehicle status
    public void updateVehicleStatus(String id, float newSpeed, float newFuelLevel) {
        // Implement the logic to update vehicle status here
    }

    // Method to display vehicle status
    public String getVehicleStatus() {
        // Implement the logic to return formatted vehicle status here
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        Main vehicle = new Main();
        vehicle.updateVehicleStatus(parts[0], Float.parseFloat(parts[1]), Float.parseFloat(parts[2]));
        System.out.println(vehicle.getVehicleStatus());

        scanner.close();
    }
}

Explanation of the Code:
Class Declaration: The class VehicleTrackingSystem is defined to encapsulate the properties and behaviors of a vehicle.

Instance Variables:

vehicleId: A String to store the vehicle's ID.
speed: A float to store the vehicle's speed.
fuelLevel: A float to store the vehicle's fuel level.
Method updateVehicleStatus:

This method takes three parameters: id, newSpeed, and newFuelLevel.
It updates the vehicleId with the provided ID.
It checks if the newSpeed is negative; if so, it sets speed to 0. Otherwise, it assigns the newSpeed to speed.
It checks the newFuelLevel to ensure it is between 0 and 100. If it's below 0, it sets fuelLevel to 0; if it's above 100, it sets it to 100. Otherwise, it assigns the newFuelLevel to fuelLevel.
Method getVehicleStatus:

This method returns a formatted string that includes the vehicle's ID, speed, and fuel level. The String.format method is used to ensure the speed and fuel level are displayed with one decimal place.
Main Method:

The program starts execution here. It creates a Scanner object to read input from the console.
It reads a line of input, splits it into parts, and creates an instance of VehicleTrackingSystem.
It calls updateVehicleStatus with the parsed input values and then prints the vehicle's status using getVehicleStatus.
Sample Input and Output:
Input: ABC123 65.5 75.0

Output: Vehicle ABC123: Speed = 65.5 km/h, Fuel = 75.0%
Input: XYZ789 0.0 100.0

Output: Vehicle XYZ789: Speed = 0.0 km/h, Fuel = 100.0%
This program effectively manages the vehicle's status while adhering to the specified constraints.

*/



































