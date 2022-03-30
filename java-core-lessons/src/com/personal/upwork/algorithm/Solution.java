package com.personal.upwork.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static int Cost;
    static List<Integer> Path = new ArrayList<Integer>();
    static List<Integer> Waste = new ArrayList<Integer>();

    static void find(int conc, int maxC, int cost, List<Integer> P, List<Integer> W, int req) {
        if (conc == req) {
            if (cost < Cost) {
                Cost = cost;
                Path.clear();
                Path.addAll(P);
                Waste.clear();
                Waste.addAll(W);
            } else if (cost == Cost && Waste.size() > W.size()) {
                Path.clear();
                Path.addAll(P);
                Waste.clear();
                Waste.addAll(W);
            }
        } else {
            // For Reagent Mixing
            if (P.contains((conc + maxC) / 2) == false) {
                P.add((conc + maxC) / 2);
                W.add(conc);
                find((conc + maxC) / 2, maxC, cost + 2, P, W, req);
                P.remove(P.size() - 1);
                W.remove(W.size() - 1);
            }

            // For buffer mixing

            if (P.contains(conc / 2) == false) {
                P.add((conc) / 2);
                W.add((conc));
                find((conc) / 2, maxC, cost + 1, P, W, req);
                P.remove(P.size() - 1);
                W.remove(W.size() - 1);
            }

            // For Waste Droplet Mixing

            int j = W.size();
            for (int k = 0; k < j; k++) {
                int i = W.get(k);
                if (P.contains((conc + i) / 2) == false) {
                    P.add((conc + i) / 2);
                    W.remove(k);
                    W.add(conc);
                    find((conc + i) / 2, maxC, cost, P, W, req);
                    P.remove(P.size() - 1);
                    W.add(k, i);
                    W.remove(j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        System.out.println("Enter the value of the reagent concentration (n)");
        int maxC = it.nextInt();
        System.out.println("Enter the value of the target concentration  (x)");
        int reqC = it.nextInt();
        List<Integer> P = new ArrayList<Integer>();
        List<Integer> W = new ArrayList<Integer>();
        P.add(0);
        P.add(maxC / 2);
        Cost = Integer.MAX_VALUE;
        find(maxC / 2, maxC, 2, P, W, reqC);
        System.out.println("Cost " + Cost);
        System.out.print("Path");
        for (int i : Path) {
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.print("Waste Droplets");
        for (int i : Waste) {
            System.out.print(" " + i);
        }
        it.close();
    }

}
