import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        Test case 1
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room1 = new ArrayList<>();
        room1.add(1);
        List<Integer> room2 = new ArrayList<>();
        room2.add(2);
        List<Integer> room3 = new ArrayList<>();
        room3.add(3);
        List<Integer> room4 = new ArrayList<>();
        room4.add(0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        System.out.println(rooms);
        System.out.println(canVisitAllRooms(rooms));

        // Test case 2
        List<List<Integer>> rooms1 = new ArrayList<>();
        List<Integer> room1_1 = new ArrayList<>();
        room1_1.add(1);
        List<Integer> room1_2 = new ArrayList<>();
        List<Integer> room1_3 = new ArrayList<>();
        room1_3.add(0);
        room1_3.add(3);
        List<Integer> room1_4 = new ArrayList<>();
        room1_4.add(2);
        rooms1.add(room1_1);
        rooms1.add(room1_2);
        rooms1.add(room1_3);
        rooms1.add(room1_4);
        System.out.println(rooms1);
        System.out.println(canVisitAllRooms(rooms1));

        // Test case 3
        List<List<Integer>> rooms2 = new ArrayList<>();
        List<Integer> room2_1 = new ArrayList<>();
        room2_1.add(1);
        List<Integer> room2_2 = new ArrayList<>();
        room2_2.add(0);
        List<Integer> room2_3 = new ArrayList<>();
        room2_3.add(3);
        List<Integer> room2_4 = new ArrayList<>();
        room2_4.add(2);
        rooms2.add(room2_1);
        rooms2.add(room2_2);
        rooms2.add(room2_3);
        rooms2.add(room2_4);
        System.out.println(rooms2);
        System.out.println(canVisitAllRooms(rooms2));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        visited[0] = 1;
        dfs(rooms, visited, 0);
        return isVisited(visited);
    }

    public static boolean isVisited(int[] visit) {
        for (int i : visit) {
            if (i == 0) return false;
        }
        return true;
    }

    public static void dfs(List<List<Integer>> rooms, int[] visited, int room) {

        List<Integer> rm = rooms.get(room);
        for (int i = 0; i < rm.size(); i++) {
            int key = (int) rm.get(i);
            if (visited[key] == 0) {
                visited[key] = 1;
                dfs(rooms, visited, key);
            }
        }
    }
}