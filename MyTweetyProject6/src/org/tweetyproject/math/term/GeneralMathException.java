package org.tweetyproject.math.term;

/*
 *  This file is part of "TweetyProject", a collection of Java libraries for
 *  logical aspects of artificial intelligence and knowledge representation.
 *
 *  TweetyProject is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License version 3 as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *  Copyright 2016 The TweetyProject Team <http://tweetyproject.org/contact/>
 */


/**
 * This class is represents a general math exception;
 * 
 * @author Matthias Thimm
 *
 */
public class GeneralMathException extends Exception {

	/**
	 * For serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates a new general math exception.
	 */
	public GeneralMathException(){
		super();
	}
	
	/**
	 * Creates a new general math exception.
	 * @param s an error message
	 */
	public GeneralMathException(String s){
		super(s);
	}
}
