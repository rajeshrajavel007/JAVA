package RapteeEnergyPrograms;

import java.util.ArrayList;

public class Find_Duplicate_VINS {
    public static void main(String[] args) {
        ArrayList<Integer> VIN = new ArrayList<>();
        VIN.add(1);
        VIN.add(3);
        VIN.add(4);
        VIN.add(2);
        VIN.add(2);
        System.out.println(VIN);
        ArrayList<Integer> duplicateVIN = findDuplicateVINS(VIN);
        System.out.println(duplicateVIN);
    }

    static ArrayList<Integer> findDuplicateVINS(ArrayList<Integer> VIN) {
        ArrayList<Integer> duplicateVIN = new ArrayList<>();
        for (int i = 0; i < VIN.size(); i++) {
            for (int j = i + 1; j < VIN.size(); j++) {
                if (VIN.get(i).equals(VIN.get(j))){
                    duplicateVIN.add(VIN.get(i));
                }
            }
        }
        return duplicateVIN;
    }
}
