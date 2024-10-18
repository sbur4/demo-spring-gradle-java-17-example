//package j17.foreign_function;
//
//import jdk.incubator.foreign.MemoryAccess;
//import jdk.incubator.foreign.MemorySegment;
//
//public class Main {
//    public static void main(String[] args) {
//        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
//            MemoryAccess.setIntAtIndex(segment, 0, 123);
//            System.out.println(MemoryAccess.getIntAtIndex(segment, 0));
//        }
//    }
//}