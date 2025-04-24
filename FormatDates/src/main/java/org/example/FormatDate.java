package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class FormatDate {
        private LocalDateTime dateTime;

        public FormatDate() {
            // Initialize with current date and time
            this.dateTime = LocalDateTime.now();
        }

        public void displayFormats() {

            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");

            DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");

            DateTimeFormatter timeWithAmPm = DateTimeFormatter.ofPattern("hh:mm a");

            DateTimeFormatter challengeFmt = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy");

            System.out.println("------------------Today's Date and Time------------------------ ");

            System.out.println(dateTime.format(format1));        // MM/DD/YYYY

            System.out.println(dateTime.format(format2));        // YYYY-MM-DD

            System.out.println(dateTime.format(format3));        // MMMM d, yyyy

            System.out.println(dateTime.format(format4));        // EEEE, MMM d, yyyy

            System.out.println(dateTime.format(timeWithAmPm));

            System.out.println("Formatdate: " + dateTime.format(challengeFmt)); // 5:02 on 05-Sep-2021
        }
    }

