/**
 * This file is part of EWItool.

    EWItool is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    EWItool is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with EWItool.  If not, see <http://www.gnu.org/licenses/>.
 */

package ewitool;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class StatusTab extends Tab {
	
	TextField ewiField, epxField, scratchpadField;
	
	StatusTab() {
		this.setText( "Status" );
		this.setClosable( false );
		GridPane gp = new GridPane();
		gp.setPadding( new Insets( 30 ) );
		
		gp.add( new Label( "EWI Connection" ), 0, 0 );
		ewiField = new TextField( "Not Connected" );
		gp.add( ewiField, 1, 0 );
		
		gp.add( new Label( "EWI Patch Exchange (EPX) Connection" ), 0, 1 );
		epxField = new TextField( "Not Connected" );
		gp.add( epxField, 1, 1 );
		
		gp.add( new Label( "Patches on Scratchpad" ), 0, 2 );
		scratchpadField = new TextField( "0" );
		gp.add( scratchpadField, 1, 2 );
		
		AnchorPane ap = new AnchorPane();
		ap.getChildren().add( gp );
		this.setContent( ap );
		
	}

}