package org.example;

public class Solution6 {
    public String convert(String s, int numRows) {
        int row;
        Row r = new Row(numRows);
        String ns;

        if (numRows == 1) {
            return  s;
        }

        StringBuilder [] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new  StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            row = r.rowJudge();
            ns = Character.toString(s.charAt(i));
            sb[row].append(ns);
        }

        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i].toString());
        }
        return sb[0].toString();
    }

    static class Row {
        private int row;
        private int numRows;
        public Row (int nr) {
            this.row = 0;
            this.numRows = nr;
        }
        public int rowJudge () {
            int temp = this.row;
            this.row = (this.row + 1)%(2*(this.numRows - 1));
            int a;
            if (temp <= this.numRows - 1) {
                return temp;
            } else {
                a = numRows - 1 - (temp - (numRows - 1));
                return a;
            }
        }
    }
}