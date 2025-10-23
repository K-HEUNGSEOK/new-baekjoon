import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node[] tree = new Node[26];
    Node root = null;

    for (int i = 0; i < n; i++) {
      char m = sc.next().charAt(0);
      char l = sc.next().charAt(0);
      char r = sc.next().charAt(0);

      int index = m - 'A';
      Node newNode;

      if (tree[index] == null) {
        newNode = new Node(m);
        tree[index] = newNode;
      } else {
        newNode = tree[index];
      }

      if (i == 0) {
        root = newNode;
      }

      if (l != '.') {
        int ldx = l - 'A';
        Node leftNode = new Node(l);
        newNode.lt = leftNode;
        tree[ldx] = leftNode;
      }
      if (r != '.') {
        int rdx = r - 'A';
        Node rightNode = new Node(r);
        newNode.rt = rightNode;
        tree[rdx] = rightNode;
      }
    }
    DFS1(root);
    System.out.println();
    DFS2(root);
    System.out.println();
    DFS3(root);
  }

  static void DFS1(Node root) {
    if (root == null) {
      return;
    } else {
      System.out.print(root.name);
      DFS1(root.lt);
      DFS1(root.rt);
    }
  }

  static void DFS2(Node root) {
    if (root == null) {
      return;
    } else {
      DFS2(root.lt);
      System.out.print(root.name);
      DFS2(root.rt);
    }
  }

  static void DFS3(Node root) {
    if (root == null) {
      return;
    } else {
      DFS3(root.lt);
      DFS3(root.rt);
      System.out.print(root.name);
    }
  }

  static class Node {

    char name;
    Node lt, rt;

    public Node(char name) {
      this.name = name;
      this.lt = null;
      this.rt = null;
    }

    @Override
    public String toString() {
      return "Node{" +
          "name=" + name +
          ", lt=" + lt +
          ", rt=" + rt +
          '}';
    }
  }
}