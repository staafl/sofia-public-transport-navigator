package eu.tanov.android.sptn.util;

import com.google.android.maps.GeoPoint;

public class MapHelper {
	/**
	 * utility class - no instance
	 */
	private MapHelper() {}

	public static GeoPoint createGeoPoint(double lat, double lon) {
		return new GeoPoint(toE6(lat), toE6(lon));
	}
	public static int toE6(double coordinate) {
		final Double result = coordinate * 1E6;
		return result.intValue();
	}
	public static double toCoordinate(int coordinateE6) {
		return coordinateE6 / 1E6;
	}
}
