/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mil.colegio;

import com.mil.colegio.views.View;
import javax.swing.SwingUtilities;

/**
 *
 * @author leandromaro
 */
public class ColegioMVC {
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void createAndShowGUI() throws Exception {
		new View();
	}
}
