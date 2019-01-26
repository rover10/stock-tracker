https://www.alphavantage.co/documentation/
https://blog.quandl.com/api-for-stock-data


https://blog.quandl.com/api-for-global-stock-data?utm_source=google&utm_medium=organic&utm_campaign=&utm_content=api-for-stock-data
Indian stock prices:
Free: https://www.quandl.com/api/v3/datasets/NSE/OIL.csv?api_key=YOURAPIKEY
Premium: https://www.quandl.com/api/v3/datasets/TC1/OIL.csv?api_key=YOURAPIKEY



---------
All data
---------
https://docs.quandl.com/docs/data-organization





----------------
NSE master data
----------------
https://www.nseindia.com/corporates/content/securities_info.htm





Indian stocks
-------------
https://www.quandl.com/data/TC1-Indian-Equities-Adjusted-End-of-Day-Prices/documentation
https://www.quandl.com/api/v3/datasets/NSE/TATASTEEL?start_date=2019-01-04&end_date=2019-01-04&api_key=

Indian stocks historical API
----------------------------
https://www.quandl.com/data/TC1-Indian-Equities-Adjusted-End-of-Day-Prices/usage/quickstart/api

API
https://www.quandl.com/api/v3/datasets/TC1/SUNPHARMA?start_date=2010-12-31&end_date=2010-12-31&api_key=YOUR_API_KEY

META-DATA API
-------------
https://www.quandl.com/api/v3/datasets/TC1/TATASTEEL/metadata?api_key=YOURAPIKEY&start_date=2018-01-17&end_date=2018-01-18
{
    "dataset": {
        "id": 19881116,
        "dataset_code": "TATASTEEL",
        "database_code": "TC1",
        "name": "Tata Steel Ltd - Adjusted Pricing",
        "description": "Pricing of Tata Steel Ltd adjusted for corporate actions",
        "refreshed_at": "2019-01-18T12:45:45.133Z",
        "newest_available_date": "2010-12-31",
        "oldest_available_date": "2000-01-03",
        "column_names": [
            "Date",
            "Open Price",
            "High Price",
            "Low Price",
            "Last Traded Price",
            "Close Price",
            "Total Traded Quantity",
            "Turnover (in Lakhs)"
        ],
        "frequency": "daily",
        "type": "Time Series",
        "premium": true,
        "database_id": 13085
    }
}



Tested - US
------------
https://www.quandl.com/api/v3/datasets/WIKI/FB/data.json?api_key=YOURAPIKEY&start_date=2018-01-17&end_date=2018-01-18
Output -
{
    "dataset_data": {
        "limit": null,
        "transform": null,
        "column_index": null,
        "column_names": [
            "Date",
            "Open",
            "High",
            "Low",
            "Close",
            "Volume",
            "Ex-Dividend",
            "Split Ratio",
            "Adj. Open",
            "Adj. High",
            "Adj. Low",
            "Adj. Close",
            "Adj. Volume"
        ],
        "start_date": "2018-01-17",
        "end_date": "2018-01-18",
        "frequency": "daily",
        "data": [
            [
                "2018-01-18",
                178.13,
                180.98,
                177.08,
                179.8,
                22783759,
                0,
                1,
                178.13,
                180.98,
                177.08,
                179.8,
                22783759
            ],
            [
                "2018-01-17",
                179.26,
                179.32,
                175.8,
                177.6,
                27356988,
                0,
                1,
                179.26,
                179.32,
                175.8,
                177.6,
                27356988
            ]
        ],
        "collapse": null,
        "order": null
    }
}


Filter by a single date
This call retrieves Dec 31, 2010 data for TC1/SUNPHARMA.
https://www.quandl.com/api/v3/datasets/TC1/SUNPHARMA?start_date=2010-12-31&end_date=2010-12-31&api_key=YOUR_API_KEY


Retrieve two columns
This call retrieves the Date and Open Price columns for TC1/SUNPHARMA.
https://www.quandl.com/api/v3/datasets/TC1/SUNPHARMA?column_index=1&api_key=YOUR_API_KEY


Filter by a date range
This call retrieves data from Dec 29, 2010 to Dec 31, 2010 for TC1/SUNPHARMA.
https://www.quandl.com/api/v3/datasets/TC1/SUNPHARMA?start_date=2010-12-29&end_date=2010-12-31&api_key=YOUR_API_KEY



Hibernate:
https://stackoverflow.com/questions/5127129/mapping-many-to-many-association-table-with-extra-columns

class User {
    @OneToMany(mappedBy = "user")
    private Set<UserService> userServices = new HashSet<UserService>();
}

class UserService {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "service_code")
    private Service service;

    @Column(name = "blocked")
    private boolean blocked;
}

class Service {
    @OneToMany(mappedBy = "service")
    private Set<UserService> userServices = new HashSet<UserService>();
}

