package org.tweetyproject.graphs;

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
 * Instances of this class represent abstract edges.
 * 
 * @author Matthias Thimm
 *
 * @param <T> The type of the nodes this edge connects
 */
public abstract class Edge<T extends Node> extends GeneralEdge<T>{

	/** The first node of this edge. */
	private T nodeA;
	
	/** The second node of this edge. */
	private T nodeB;
	
	/** (Optional) The label of the edge. */
	private String label;
	
	/** Creates a new edge for the given nodes.
	 * @param nodeA some node.
	 * @param nodeB some node.
	 */
	public Edge(T nodeA, T nodeB){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}
	 
	/**
	 * Creates a new edge for the given nodes.
	 * @param nodeA some node.
	 * @param nodeB some node.
	 * @param label some edge label.
	 */
	public Edge(T nodeA, T nodeB, String label){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.label = label;
	}
	
	/**
	 * Returns the first node of this edge.
	 * @return the first node of this edge. 
	 */
	public T getNodeA(){
		return this.nodeA;
	}
	
	/**
	 * Returns the second node of this edge.
	 * @return the second node of this edge.
	 */
	public T getNodeB(){
		return this.nodeB;
	}
	
	/**
	 * Returns the label of this edge.
	 * @return the label of this edge.
	 */
	public String getLabel(){
		return this.label;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeA == null) ? 0 : nodeA.hashCode());
		result = prime * result + ((nodeB == null) ? 0 : nodeB.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge<?> other = (Edge<?>) obj;
		if (nodeA == null) {
			if (other.nodeA != null)
				return false;
		} else if (!nodeA.equals(other.nodeA))
			return false;
		if (nodeB == null) {
			if (other.nodeB != null)
				return false;
		} else if (!nodeB.equals(other.nodeB))
			return false;
		if (label == null) {
			if(other.label != null)
				return false;
		} else if(!label.contentEquals(other.label))
			return false;
		return true;
	}
}
