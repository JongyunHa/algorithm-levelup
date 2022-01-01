import java.util.LinkedList;
import java.util.Scanner;

public class EmergencyRoom {

  public static class Patient {

    public int id;
    public int priority;
  }

  public static int solution(LinkedList<Patient> patients, int target) {
    int answer = 1;

    while (true) {
      Patient first = patients.removeFirst();
      boolean flag = true;
      for (int i = 0; i < patients.size(); i++) {
        if (first.priority < patients.get(i).priority) {
          flag = false;
          break;
        }
      }
      if (!flag) {
        patients.add(first);
      } else {
        if (first.id == target) {
          break;
        }
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();

    LinkedList<Patient> patients = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      Patient p = new Patient();
      p.id = i;
      p.priority = sc.nextInt();
      patients.add(p);
    }

    System.out.println(solution(patients, m));
  }

}
