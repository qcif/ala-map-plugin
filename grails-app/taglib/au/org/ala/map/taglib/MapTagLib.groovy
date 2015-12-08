package au.org.ala.map.taglib

class MapTagLib {
    static namespace = "m"

    static final String DEFAULT_WIDTH = "650px"
    static final String DEFAULT_HEIGHT = "500px"

    /**
     * Render a Map container.
     *
     * @attr id REQUIRED the unique ID for the map
     * @attr width The width for the map div. Optional - defaults to {@link #DEFAULT_WIDTH}
     * @attr height The height for the map div. Optional - defaults to {@link #DEFAULT_HEIGHT}
     */
    def map = { attrs ->
        String leafletImageLocation = "${r.resource(uri: '/vendor/leaflet-0.7.7/images/marker-icon.png').replaceFirst("/marker-icon.png", "")}"
        println leafletImageLocation
        String style = "width: ${attrs.width ?: DEFAULT_WIDTH}; height: ${attrs.height ?: DEFAULT_HEIGHT}"

        out << "<div id='${attrs.id}' style='${style}' data-leaflet-img='${leafletImageLocation}'></div>"
    }
}
