// package lv.rvt;

// import java.util.ArrayList;
// import java.util.List;

// class ChangeHistory {
//     private List<Double> history;       

//     public ChangeHistory() {
//         history = new ArrayList<>();
//     }

//     public void add(double status) {
//         history.add(status);
//     }

//     public void clear() {   
//         history.clear();
//     }

//     public double maxValue() {
//         if (history.isEmpty()) return 0;
//         return history.stream().max(Double::compare).orElse(0.0);
//     }

//     public double minValue() {
//         if (history.isEmpty()) return 0;
//         return history.stream().min(Double::compare).orElse(0.0);
//     }

//     public double average() {
//         if (history.isEmpty()) return 0;
//         return history.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
//     }

//     public String toString() {
//         return history.toString();
//     }
// }