import java.util.Scanner;

public class Election {
  private int numCandidates;
  private int totalVotes;
  private String[] name;
  private int[] votes;

  public Election() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("ENTER NUMBER OF CANDIDATES: ");
    int num = scanner.nextInt();
    setNumCandidates(num);
    for (int i = 0; i < num; i++) {
      System.out.print("Enter candidate's name: ");
      String cname = scanner.next();
      System.out.print("Enter candidate's vote: ");
      int cvotes = scanner.nextInt();
      addCandidate(i, cname, cvotes);
    }
    scanner.close();
  }

  public static void main(String[] args) {
    Election election = new Election();
    election.calcTotalVotes();
    election.printResults();
  }

  public void setNumCandidates(int num) {
    numCandidates = num;
    name = new String[num];
    votes = new int[num];
  }

  public void addCandidate(int cindex, String cname, int cvotes) {
    name[cindex] = cname;
    votes[cindex] = cvotes;
  }

  public int calcTotalVotes() {
    int sum = 0;
    for (int i = 0; i < numCandidates; i++) {
      sum += votes[i];
    }
    totalVotes = sum;
    return sum;
  }

  public int getTotalVotes() {
    return totalVotes;
  }

  public int calcWinner() {
    int maxIndex = 0;
    int maxValue = votes[0];
    for (int i = 1; i < numCandidates; i++) {
      if (votes[i] > maxValue) {
        maxIndex = i;
        maxValue = votes[i];
      }
    }
    return maxIndex;
  }

  public void printResults() {
    System.out.println("CANDIDATE   VOTES RECEIVED  % OF VOTES");
    for (int i = 0; i < numCandidates; i++) {
      double percent = ((double) votes[i] / totalVotes) * 100;
      System.out.printf("%-12s%10d%11.2f%n", name[i], votes[i], percent);
    }
    System.out.println();
    System.out.printf("Total Votes:%d%n", totalVotes);
    int winnerIndex = calcWinner();
    System.out.printf("Winner of the election is: %s%n", name[winnerIndex]);
  }
}
