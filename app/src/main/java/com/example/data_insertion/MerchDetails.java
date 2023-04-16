package com.example.data_insertion;

public class MerchDetails {

        String name;
        String regno;
        String phoneno;
        String year;
        String branch;
        int[] count = new int[7];
        String amount;
        String comments;

        public MerchDetails() {
        }

        public MerchDetails(String name, String regno, String phoneno,
                            String year, String branch, int[] count,
                            String amount, String comments) {
            this.name = name;
            this.regno = regno;
            this.phoneno = phoneno;
            this.year = year;
            this.branch = branch;
            this.count = count;
            this.amount = amount;
            this.comments = comments;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegno() {
            return regno;
        }

        public void setRegno(String regno) {
            this.regno = regno;
        }

        public String getPhoneno() {
            return phoneno;
        }

        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getBranch() {
            return branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public int[] getCount() {
            return count;
        }

        public void setCount(int[] count) {
            this.count = count;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

}
