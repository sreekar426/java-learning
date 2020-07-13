package com.thread;

public class GPS {
	
	public static void main(String[] args) {
		
		String line="$GPRMC,055218.000,A,1259.4845,N,08014.7602,E,0.07,120.70,171018,,,A*64";
		String gpsData = line.substring(1);
		String[] tokens = gpsData.split(",");
		
		GPSPosition position = new GPSPosition();
		position.setLat(latitude2Decimal(tokens[3], tokens[4]));
		position.setLon(longitude2Decimal(tokens[5], tokens[6]));
		position.setResponse("success");
		System.out.println(position.getLat()/100);
		System.out.println(position.getLon()/100);
		//System.out.println(decimalToDMS(4916.45));
		//System.out.println(decimalToDMS(12311.12));
		FlatEarthDist f=new FlatEarthDist();
	double km=f.distance(12.990996, 80.245592, position.getLat()/100, position.getLon()/100);
	System.out.println(Math.round(km/1000));
		//System.out.println(position.getLat());
		//System.out.println(position.getLon());
	}
	
	private static double decimalToDMS(double value) {
        double result ;
        double degValue = value / 100;
        int degrees = (int) degValue;
        double decMinutesSeconds = ((degValue - degrees)) / .60;
        double minuteValue = decMinutesSeconds * 60;
        int minutes = (int) minuteValue;
        double secsValue = (minuteValue - minutes) * 60;
       // result = degrees + "\u00B0" + " " + minutes + "' " + String.format("%.1f", secsValue) + "\" ";
       double  decimal = ((minutes * 60)+secsValue) / (60*60);
       result = degrees + decimal;
        return result;
    }
	
	/**
	 * Decimal to longitude.
	 *
	 * @param lon the lon
	 * @param direction        the direction
	 * @return the float
	 */
	private static double longitude2Decimal(String lon, String direction) {


		double longitudeDegrees = 0.0;

		if (lon.indexOf('.') != -1) {

			int minutesPosition = lon.indexOf('.') - 2;
			double minutes = Double.parseDouble(lon.substring(minutesPosition));
			double decimalDegrees = Double.parseDouble(lon.substring(minutesPosition)) / 60.0f;

			double degree = Double.parseDouble(lon) - minutes;
			double wholeDegrees = 100.0 * degree / 100;

			longitudeDegrees = wholeDegrees + decimalDegrees;

			if (direction.startsWith("W")) {
				longitudeDegrees = -longitudeDegrees;
			}

		}
		return longitudeDegrees;
	}
	
	 private static double latitude2Decimal(String lat, String direction) {


			double latitudeDegrees = 0.0;

			if (lat.indexOf('.') != -1) {

				int minutesPosition = lat.indexOf('.') - 2;
				double minutes = Double.parseDouble(lat.substring(minutesPosition));
				double decimalDegrees = Double.parseDouble(lat.substring(minutesPosition)) / 60.0f;

				double degree = Double.parseDouble(lat) - minutes;
				double wholeDegrees = 100.0 * degree / 100;

				latitudeDegrees = wholeDegrees + decimalDegrees;

				if (direction.startsWith("S")) {
					latitudeDegrees = -latitudeDegrees;
				}
			}
			return latitudeDegrees;
		}

}
	
	/**
	 * The Class GPSPosition.
	 */
	 class GPSPosition {

		/** The latitudeFromGps. */
		private double latitudeFromGps = 0.0;

		/** The longitudeFromGps. */
		private double longitudeFromGps = 0.0;

		/** The response. */
		private String response = "";

		/**
		 * This method gets the latitude from GPS.
		 *
		 * @return the latitudeFromGps
		 */
		public double getLat() {
			return latitudeFromGps;
		}

		/**
		 * This method sets the latitude.
		 *
		 * @param lat the new lat
		 */
		public void setLat(double lat) {
			this.latitudeFromGps = lat;
		}

		/**
		 * This method gets the longitude from GPS.
		 *
		 * @return the longitudeFromGps
		 */
		public double getLon() {
			return longitudeFromGps;
		}

		/**
		 * This method sets the longitude.
		 *
		 * @param lon the new lon
		 */
		public void setLon(double lon) {
			this.longitudeFromGps = lon;
		}

		/**
		 * This method gets the response.
		 *
		 * @return the response
		 */
		public String getResponse() {
			return response;
		}

		/**
		 * This method sets the response.
		 * 
		 * @param response the response to set
		 */
		public void setResponse(String response) {
			this.response = response;
		}
	}
	 
	  class FlatEarthDist {
		    //returns distance in meters
		    public static double distance(double lat1, double lng1, 
		                                      double lat2, double lng2){
		     double a = (lat1-lat2)*FlatEarthDist.distPerLat(lat1);
		     double b = (lng1-lng2)*FlatEarthDist.distPerLng(lat1);
		     return Math.sqrt(a*a+b*b);
		    }

		    private static double distPerLng(double lat){
		      return 0.0003121092*Math.pow(lat, 4)
		             +0.0101182384*Math.pow(lat, 3)
		                 -17.2385140059*lat*lat
		             +5.5485277537*lat+111301.967182595;
		    }

		    private static double distPerLat(double lat){
		            return -0.000000487305676*Math.pow(lat, 4)
		                -0.0033668574*Math.pow(lat, 3)
		                +0.4601181791*lat*lat
		                -1.4558127346*lat+110579.25662316;
		    }
		}
	

