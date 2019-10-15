## Assignment 2
#### _OSGi shell for unit conversion_

### Contents
`tdt4250.assignment2.unitconverter.api` contains the classes for the API for unit conversion.
`tdt4250.assignment2.unitconverter.gogo` contains the component for handling commands in the gogo shell.
`tdt4250.assignment2.unitconverter.servlet` contains the servlet that can be queried for unit conversion.
`tdt4250.assignment2.unitconverter.conversions` contains an implementation of UnitConversion and Units.
`tdt4250.assignment2.unitconverter.util` contains a util class for configuration of unit conversions.

### Setup
1. Import this project into Eclipse as a OSGi workspace.
2. Open the  `launch.bndrun` file in `tdt4250.assignment2.unitconverter.servlet` and click __Run OSGi__.


### Usage

#### Query the servlet
Query the servlet by entering URLs in this format: http://localhost:8080/convert?v=100&from=C&to=F.

#### Gogo shell
- `list` will show available bundles.
- `add` will add a new conversion. The units needed for the conversion needs to already exist. The format is: `add C F "F = 0.56 * C - 17.8" `.
- `convert` will convert a value from one unit to another. The format is: `convert C F 10`
