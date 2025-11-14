package com.pluralsight.Shawerma.MenuItem;

import com.pluralsight.Shawerma.User.Order;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void writeReceipt(Order order) {
        if (order == null || order.isEmpty()) {
            return;
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String fileName = "Receipts/" + timestamp + ".txt";

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            writer.println(order.getOrderDetails());
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
