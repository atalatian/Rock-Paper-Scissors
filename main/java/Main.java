/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;



class RandomNumber{
    private String move;
    public RandomNumber(){
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("1", "rock");
        my_dict.put("2", "paper");
        my_dict.put("3", "scissors");
        Random rand = new Random();
        int int_random = rand.nextInt(3) + 1;
        String str_random = Integer.toString(int_random);
        move = my_dict.get(str_random);
    }
    
    public String getMove(){
        return move;
    }
}





public class Main {
    public static void main(String[] args) {
        JFrame main=new JFrame();
        main.setLayout(new FlowLayout());
        JButton rock = new JButton("Rock");
        JButton paper = new JButton("Paper");
        JButton scissors = new JButton("Scissors");
 
        scissors.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                main.setVisible(false);
                JFrame new_frame=new JFrame();
                new_frame.getContentPane().setLayout(
                    new BoxLayout(new_frame.getContentPane(), BoxLayout.LINE_AXIS)
                );
                JLabel my_move=new JLabel("Your Move: Scissors");
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                my_move.setForeground(Color.blue);
                new_frame.add(my_move);
                ////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////
                String result_message = null;
                String opp_message = null;
                String color = null;  
                RandomNumber rand = new RandomNumber();
                String hand = rand.getMove();
                if(null != hand)switch (hand) {
                    case "rock" -> {
                        opp_message = "Opponent Move: Rock";
                        result_message = "Lose";
                        color = "red";
                    }
                    case "paper" -> {
                        opp_message = "Opponent Move: Paper";
                        result_message = "Win";
                        color = "green";
                    }
                    case "scissors" -> {
                        opp_message = "Opponent Move: Scissors";
                        result_message = "Draw";
                        color = "gray";
                    }
                    default -> {
                    }
                }
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel opponent =new JLabel(opp_message);
                opponent.setForeground(Color.RED);
                new_frame.add(opponent);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel result=new JLabel(result_message);
                if(null != color)switch (color) {
                    case "gray" -> result.setForeground(Color.GRAY);
                    case "green" -> result.setForeground(Color.blue);
                    case "red" -> result.setForeground(Color.RED);
                    default -> {
                    }
                }
                result.setFont(new Font("Serif", Font.BOLD, 18));
                new_frame.add(result);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JButton again=new JButton("Again");
                new_frame.add(again);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                again.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        new_frame.setVisible(false);
                        main.setVisible(true);
                    }
                });
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.setSize(600,150);
                new_frame.setVisible(true);
            }
        });
        
        paper.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                main.setVisible(false);
                JFrame new_frame=new JFrame();
                new_frame.getContentPane().setLayout(
                    new BoxLayout(new_frame.getContentPane(), BoxLayout.LINE_AXIS)
                );
                JLabel my_move=new JLabel("Your Move: Paper");
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                my_move.setForeground(Color.blue);
                new_frame.add(my_move);
                ////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////
                String result_message = null;
                String opp_message = null;
                String color = null;  
                RandomNumber rand = new RandomNumber();
                String hand = rand.getMove();
                if(null != hand)switch (hand) {
                    case "rock" -> {
                        opp_message = "Opponent Move: Rock";
                        result_message = "Win";
                        color = "green";
                    }
                    case "paper" -> {
                        opp_message = "Opponent Move: Paper";
                        result_message = "Draw";
                        color = "gray";
                    }
                    case "scissors" -> {
                        opp_message = "Opponent Move: Scissors";
                        result_message = "Lose";
                        color = "red";
                    }
                    default -> {
                    }
                }
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel opponent =new JLabel(opp_message);
                opponent.setForeground(Color.RED);
                new_frame.add(opponent);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel result=new JLabel(result_message);
                if(null != color)switch (color) {
                    case "gray" -> result.setForeground(Color.GRAY);
                    case "green" -> result.setForeground(Color.blue);
                    case "red" -> result.setForeground(Color.RED);
                    default -> {
                    }
                }
                result.setFont(new Font("Serif", Font.BOLD, 18));
                new_frame.add(result);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JButton again=new JButton("Again");
                new_frame.add(again);
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                again.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        new_frame.setVisible(false);
                        main.setVisible(true);
                    }
                });
                //////////////////////////////////////////////////
                //////////////////////////////////////////////////
                new_frame.setSize(600,150);
                new_frame.setVisible(true);
            } 
        });
        
        rock.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){
                main.setVisible(false);
                JFrame rock_frame=new JFrame();
                rock_frame.getContentPane().setLayout(
                    new BoxLayout(rock_frame.getContentPane(), BoxLayout.LINE_AXIS)
                ); 
                JLabel my_move=new JLabel("Your Move: Rock");
                rock_frame.add(Box.createRigidArea(new Dimension(50,0)));
                my_move.setForeground(Color.blue);
                rock_frame.add(my_move);
                ////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////
                String result_message = null;
                String opp_message = null;
                String color = null;  
                RandomNumber rand = new RandomNumber();
                String hand = rand.getMove();
                if(null != hand)switch (hand) {
                    case "rock" -> {
                        opp_message = "Opponent Move: Rock";
                        result_message = "Draw";
                        color = "gray";
                    }
                    case "paper" -> {
                        opp_message = "Opponent Move: Paper";
                        result_message = "Lose";
                        color = "red";
                    }
                    case "scissors" -> {
                        opp_message = "Opponent Move: Scissors";
                        result_message = "Win";
                        color = "green";
                    }
                    default -> {
                    }
                }
                //////////////////////////////////////
                ///////////////////////////////////////
                rock_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel opponent =new JLabel(opp_message);
                opponent.setForeground(Color.RED);
                rock_frame.add(opponent);
                //////////////////////////////////////
                ///////////////////////////////////////
                rock_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JLabel result=new JLabel(result_message);
                if(null != color)switch (color) {
                    case "gray" -> result.setForeground(Color.GRAY);
                    case "green" -> result.setForeground(Color.blue);
                    case "red" -> result.setForeground(Color.RED);
                    default -> {
                    }
                }
                result.setFont(new Font("Serif", Font.BOLD, 18));
                rock_frame.add(result);
                //////////////////////////////////////
                ///////////////////////////////////////
                rock_frame.add(Box.createRigidArea(new Dimension(50,0)));
                JButton again=new JButton("Again");
                rock_frame.add(again);
                //////////////////////////////////////
                ///////////////////////////////////////
                again.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        rock_frame.setVisible(false);
                        main.setVisible(true);
                    }
                });
                ////////////////////////////////////////
                ////////////////////////////////////////           
                rock_frame.setSize(600,150);
                rock_frame.setVisible(true);
            }
        });
        main.add(rock);
        main.add(paper);
        main.add(scissors);
        main.setSize(300,80);
        main.setVisible(true);
        
    }
}