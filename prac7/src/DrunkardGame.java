import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Stack;

class DrunkardGame extends JFrame {
    JButton add = new JButton("Add cards to player");
    JButton play = new JButton("Play!");

    JLabel winnerLabel = new JLabel("WINNER:");
    JLabel winner = new JLabel("");
    JLabel firstPlayersCards = new JLabel();
    JLabel secondPlayersCards = new JLabel();
    JLabel playerFirst = new JLabel();
    JLabel playerSecond = new JLabel();

    JTextField cards = new JTextField(9);

    public DrunkardGame() {
        super("Drunkard");
        setLayout(null);
        setSize(410, 280);
        Font fontFoButtons = new Font("Times new Roman", Font.PLAIN, 11);

        Stack<Integer> firstPlayer = new Stack<>();
        Stack<Integer> secondPlayer = new Stack<>();

        add(cards);
        cards.setBounds(160, 20, 80, 20);

        add(add);
        add.setBounds(135, 50, 130, 30);
        add.setFont(fontFoButtons);

        add(play);
        play.setBounds(165, 200, 70, 20);
        play.setFont(fontFoButtons);

        add(winnerLabel);
        winnerLabel.setVerticalAlignment(JLabel.CENTER);
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);
        winnerLabel.setBounds(160, 110, 80, 20);
        winnerLabel.setFont(new Font("Times new Roman", Font.BOLD, 15));

        add(winner);
        winner.setVerticalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        winner.setBounds(125, 130, 150, 20);
        winner.setFont(new Font("Times new Roman", Font.BOLD, 13));

        add(playerFirst);
        playerFirst.setText("First player");
        playerFirst.setVerticalAlignment(JLabel.CENTER);
        playerFirst.setHorizontalAlignment(JLabel.CENTER);
        playerFirst.setBounds(0, 60, 150, 20);
        playerFirst.setFont(new Font("Times new Roman", Font.BOLD, 13));

        add(playerSecond);
        playerSecond.setText("Second player");
        playerSecond.setVerticalAlignment(JLabel.CENTER);
        playerSecond.setHorizontalAlignment(JLabel.CENTER);
        playerSecond.setBounds(250, 60, 150, 20);
        playerSecond.setFont(new Font("Times new Roman", Font.BOLD, 13));

        add(firstPlayersCards);
        firstPlayersCards.setVerticalAlignment(JLabel.CENTER);
        firstPlayersCards.setHorizontalAlignment(JLabel.CENTER);
        firstPlayersCards.setBounds(0, 80, 150, 20);

        add(secondPlayersCards);
        secondPlayersCards.setVerticalAlignment(JLabel.CENTER);
        secondPlayersCards.setHorizontalAlignment(JLabel.CENTER);
        secondPlayersCards.setBounds(250, 80, 150, 20);

        add.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                String cardsString = cards.getText();
                int[] numArr = Arrays.stream(cardsString.split(" ")).mapToInt(Integer::parseInt).toArray();
                if (firstPlayer.size() == 0) {
                    for (int n : numArr) {
                        firstPlayer.add(n);
                    }
                    firstPlayersCards.setText(cardsString);
                } else {
                    for (int n : numArr) {
                        secondPlayer.add(n);
                    }
                    secondPlayersCards.setText(cardsString);
                }
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        play.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                winner.setText(Drunkard(firstPlayer, secondPlayer));
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
    }

    public static String Drunkard(Stack<Integer> first, Stack<Integer> second) {
        int count = 0;

        for (int i = 0; i < 106; i++) {
            count++;
            if (first.get(0) > second.get(0) || ((first.get(0) == 0) && (second.get(0) == 9))) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0) || ((first.get(0) == 9) && (second.get(0) == 0))) {
                second.add(second.get(0));
                second.add(first.get(0));
            }
            first.remove(0);
            second.remove(0);

            if (first.size() == 0) {
                return "Second on " + count + " move";
            } else if (second.size() == 0) {
                return "First on " + count + " move";
            }
        }
        return "Botva!";
    }

    public static void main(String[] args) {
        new DrunkardGame().setVisible(true);
    }
}