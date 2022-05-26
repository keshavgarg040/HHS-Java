package chapter10Personal;

import javax.swing.*;

import java.awt.event.*;

public class MakeComputer extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    String[] intelCpuStrings = { "i9-12900k", "i7-12700k", "i5-12500k", "i3-12300k" };
    String[] amdCpuStrings = { "5950X", "5800X", "5600X", "3100" };
    String[] appleCpuStrings = { "M1", "M1Max", "M1Pro" };
    String[] nvidiaGpuStrings = { "3090", "3080", "3070ti", "3070", "3060ti", "3060" };
    String[] amdGpuStrings = { "6900XT", "6900", "6800XT", "6800", "6700XT", "6700" };
    String[] ramList = { "8", "16", "32", "64" };
    String[] storageList = { "1", "2", "4" };
    static MakeComputer f1;
    JPanel cpuButtonPanel = new JPanel();
    JPanel gpuButtonPanel = new JPanel();
    JButton intelButton = new JButton("Intel");
    JButton amdButton = new JButton("AMD");
    JButton appleButton = new JButton("Apple");
    JButton nvidiaGpuButton = new JButton("NVidia");
    JButton amdGpuButton = new JButton("AMD");
    JButton makeComputerButton = new JButton("Make Computer");
    JFrame addInfoFrame;
    JFrame gpuButtonFrame;
    JFrame dropDownFrame;
    JPanel dropDownPanel = new JPanel();
    JPanel createButtonPanel = new JPanel();
    JButton createComputer = new JButton();
    String[] cpuList = {};
    String[] gpuList = {};
    JComboBox<String> intelCpuBox = new JComboBox<String>(intelCpuStrings);
    JComboBox<String> amdCpuBox = new JComboBox<String>(amdCpuStrings);
    JComboBox<String> appleCpuBox = new JComboBox<String>(appleCpuStrings);
    JComboBox<String> nvidiaGpuBox = new JComboBox<String>(nvidiaGpuStrings);
    JComboBox<String> amdGpuBox = new JComboBox<String>(amdGpuStrings);
    JComboBox<String> ramBox = new JComboBox<String>(ramList);
    JComboBox<String> storageBox = new JComboBox<String>(storageList);
    String cpuType;
    String gpuType;
    String cpuOutputString;
    String gpuOutputString;

    public MakeComputer() {
	intelButton.addActionListener(this);
	amdButton.addActionListener(this);
	appleButton.addActionListener(this);
	cpuButtonPanel.add(intelButton);
	cpuButtonPanel.add(amdButton);
	cpuButtonPanel.add(appleButton);
	this.add(cpuButtonPanel);

	nvidiaGpuButton.addActionListener(this);
	amdGpuButton.addActionListener(this);
	gpuButtonPanel.add(nvidiaGpuButton);
	gpuButtonPanel.add(amdGpuButton);

	intelCpuBox.addActionListener(this);
	amdCpuBox.addActionListener(this);
	appleCpuBox.addActionListener(this);
	nvidiaGpuBox.addActionListener(this);
	amdGpuBox.addActionListener(this);
	ramBox.addActionListener(this);
	storageBox.addActionListener(this);
	makeComputerButton.addActionListener(this);
	dropDownPanel.add(intelCpuBox);
	dropDownPanel.add(amdCpuBox);
	dropDownPanel.add(appleCpuBox);
	dropDownPanel.add(nvidiaGpuBox);
	dropDownPanel.add(amdGpuBox);
	dropDownPanel.add(ramBox);
	dropDownPanel.add(storageBox);
	dropDownPanel.add(makeComputerButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == intelButton) {
	    cpuType = "intel";
	    f1.setVisible(false);
	    dropDownFrame = new JFrame();
	    gpuButtonFrame = new JFrame();
	    gpuButtonFrame.setTitle("Choose Your GPU Brand");
	    gpuButtonFrame.setBounds(200, 200, 450, 300);
	    gpuButtonFrame.getContentPane().add(gpuButtonPanel);
	    gpuButtonFrame.setVisible(true);
	    amdCpuBox.setVisible(false);
	    appleCpuBox.setVisible(false);
	} else if (e.getSource() == amdButton) {
	    cpuType = "amd";
	    f1.setVisible(false);
	    dropDownFrame = new JFrame();
	    gpuButtonFrame = new JFrame();
	    gpuButtonFrame.setTitle("Choose Your GPU Brand");
	    gpuButtonFrame.setBounds(200, 200, 450, 300);
	    gpuButtonFrame.getContentPane().add(gpuButtonPanel);
	    gpuButtonFrame.setVisible(true);
	    intelCpuBox.setVisible(false);
	    appleCpuBox.setVisible(false);
	} else if (e.getSource() == appleButton) {
	    cpuType = "apple";
	    f1.setVisible(false);
	    dropDownFrame = new JFrame();
	    dropDownFrame.setBounds(200, 200, 450, 300);
	    dropDownFrame.getContentPane().add(dropDownPanel);
	    dropDownFrame.setVisible(true);
	    intelCpuBox.setVisible(false);
	    amdCpuBox.setVisible(false);
	    nvidiaGpuBox.setVisible(false);
	    amdGpuBox.setVisible(false);
	} else if (e.getSource() == nvidiaGpuButton) {
	    gpuType = "nvidia";
	    gpuButtonFrame.setVisible(false);
	    dropDownFrame.setBounds(200, 200, 450, 300);
	    dropDownFrame.getContentPane().add(dropDownPanel);
	    dropDownFrame.setVisible(true);
	    amdGpuBox.setVisible(false);
	} else if (e.getSource() == amdGpuButton) {
	    gpuType = "amd";
	    gpuButtonFrame.setVisible(false);
	    dropDownFrame.setBounds(200, 200, 450, 300);
	    dropDownFrame.getContentPane().add(dropDownPanel);
	    dropDownFrame.setVisible(true);
	    nvidiaGpuBox.setVisible(false);
	} else if (e.getSource() == makeComputerButton) {
	    dropDownFrame.setVisible(false);
	    if (cpuType.equals("intel")) {
		cpuOutputString = "CPU: " + intelCpuBox.getSelectedItem();
	    } else if (cpuType.equals("amd")) {
		cpuOutputString = "CPU: " + amdCpuBox.getSelectedItem();
	    } else if (cpuType.equals("apple")) {
		cpuOutputString = "CPU: " + appleCpuBox.getSelectedItem();
	    }
	    if (gpuType.equals("nvidia")) {
		gpuOutputString = "GPU: " + nvidiaGpuBox.getSelectedItem();
	    } else if (gpuType.equals("amd")) {
		gpuOutputString = "GPU: " + amdGpuBox.getSelectedItem();
	    }
	    JOptionPane.showMessageDialog(null,
		    cpuOutputString + "\n" + gpuOutputString + "\nStorage: " + storageBox.getSelectedItem()
			    + " TB\nRAM: " + ramBox.getSelectedItem() + " GB",
		    "Your Computer", JOptionPane.PLAIN_MESSAGE);
	}
    }

    public static void main(String[] args) {
	f1 = new MakeComputer();
	f1.setTitle("Choose CPU Manufacturer");
	f1.setBounds(100, 100, 500, 200);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
    }

}