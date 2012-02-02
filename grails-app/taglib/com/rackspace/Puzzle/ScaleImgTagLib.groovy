package com.rackspace.Puzzle

/**
 * @author mich4570
 *
 * A simple class to facilitate the drawing of the scale for the game
 */
class ScaleImgTagLib {
	def scimg = {attrs, body ->
		if(attrs["scale-result"]>0)
			out << "<img src=${createLinkTo(dir: 'images', file: 'scale-right.png')} alt='Grails'/>"
		else if(attrs["scale-result"]<0)
			out << "<img src=${createLinkTo(dir: 'images', file: 'scale-left.png')} alt='Grails'/>"
		else
			out << "<img src=${createLinkTo(dir: 'images', file: 'scale-balanced.png')} alt='Grails'/>"
	}
}
