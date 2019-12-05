1. This project is as of now based on Spring REST, Spring MVC and uses Jackson, Thymeleaf for json databinding and UI.

2. Real-time flight info is from: https://opensky-network.org/api

3. In opensky, for anonymous users, there is no call limitations but you will always get only latest available data with
   a time resolution of 10 seconds i.e. time parameter (if supplied in the request) will be ignore.

4. Reverse Geocoded location data can be obtained from: opencagedata and it's api-key: 6d5ecd5464e44bb5b26dffd6cf9f69d5
   Here, the limitation is some 2000 requests per day.
   	
5. International Civil Aviation Organization (ICAO) assigned 3-letter codes and other details of the full database dump
   is in an google sheet at advancenalytics, you can dump that into a db and use it as a lookup to find the airlines names
   on the basis of first 3 characters of the icao-24 hex code obtained from the opensky REST call. 	
   
   

