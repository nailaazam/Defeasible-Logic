

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
package org.tweetyproject.math.term;

import java.util.List;

import org.tweetyproject.math.*;

/**
 * This class represents an exponential expression by "e".
 * 
 * @author Matthias Thimm
 */
public class Exp extends FunctionalTerm {
	
	/**
	 * Creates a new exponential term with the given term.
	 * @param term the potentiated term.
	 */
	public Exp(Term term) {
		super(term);
	}
	
	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.FunctionalTerm#replaceTerm(org.tweetyproject.math.term.Term, org.tweetyproject.math.term.Term)
	 */
	@Override
	public Term replaceTerm(Term toSubstitute, Term substitution) {
		return new Exp(this.getTerm().replaceTerm(toSubstitute, substitution));
	}

	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.FunctionalTerm#toString()
	 */
	@Override
	public String toString() {
		return "exp(" + this.getTerm() + ")";
	}

	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.FunctionalTerm#value()
	 */
	@Override
	public Constant value() throws IllegalArgumentException {
		return new FloatConstant(Math.exp(this.getTerm().doubleValue()));
	}

	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.Term#derive(org.tweetyproject.math.term.Variable)
	 */
	@Override
	public Term derive(Variable v) throws NonDifferentiableException {
		Product t = new Product();
		t.addTerm(this.getTerm().derive(v));
		t.addTerm(this);
		return t;
	}

	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.Term#isContinuous(org.tweetyproject.math.term.Variable)
	 */
	@Override
	public boolean isContinuous(Variable v) {
		return this.getTerm().isContinuous(v);
	}

	/* (non-Javadoc)
	 * @see org.tweetyproject.math.term.Term#simplify()
	 */
	@Override
	public Term simplify() {
		return new Exp(this.getTerm().simplify());
	}

	@Override
	public List<Term> getTerms() {

		return null;
	}

}
