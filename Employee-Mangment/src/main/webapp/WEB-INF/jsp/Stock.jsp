<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
function loadDoc(){
	alert('Hi')
	     $.ajax({
	        type: "post",
	        headers: { 'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')},
	        url: "https://chartink.com/screener/process",
	        cache: false,       
	        data:{'scan_clause','( {33489} ( ( {33489} ( ( {33489} ( latest close > 200 and latest close < 1000 and latest close > latest open and latest close > 1 day ago close and( {33489} ( ( {33489} ( [0] 5 minute macd line( 26,12,9 ) > 0 and [ -1 ] 5 minute macd line( 26,12,9 ) <= 0 or [0] 5 minute macd line( 26,12,9 ) > 0 ) ) and( {33489} ( [0] 5 minute macd line( 26,12,9 ) > [0] 5 minute macd signal( 26,12,9 ) and [ -1 ] 5 minute macd line( 26,12,9 ) <= [ -1 ] 5 minute macd signal( 26,12,9 ) or [0] 5 minute macd line( 26,12,9 ) > [0] 5 minute macd signal( 26,12,9 ) ) ) and( {33489} ( [0] 5 minute adx di positive( 14 ) > [0] 5 minute adx di negative( 14 ) and [ -1 ] 5 minute adx di positive( 14 ) <= [ -1 ] 5 minute adx di negative( 14 ) or [0] 5 minute adx di positive( 14 ) > [0] 5 minute adx di negative( 14 ) ) ) and( {33489} ( [0] 5 minute adx di positive( 14 ) > [0] 5 minute adx( 14 ) ) ) and( {33489} ( [0] 5 minute adx( 14 ) > [0] 5 minute adx di negative( 14 ) and [ -1 ] 5 minute adx( 14 ) <= [ -1 ] 5 minute adx di negative( 14 ) or [0] 5 minute adx( 14 ) > [0] 5 minute adx di negative( 14 ) ) ) and( {33489} ( [0] 5 minute rsi( 14 ) > 60 and [ -1 ] 5 minute rsi( 14 ) <= 60 or [0] 5 minute rsi( 14 ) > 60 ) ) and( {33489} ( [0] 5 minute close > [0] 5 minute supertrend( 10 , 2 ) or [0] 5 minute close > [0] 5 minute supertrend( 10 , 2 ) and [ -1 ] 5 minute close <= [ -1 ] 5 minute supertrend( 10 , 2 ) ) ) and( {33489} ( [0] 15 minute close > [0] 15 minute supertrend( 10 , 2 ) or [0] 15 minute close > [0] 15 minute supertrend( 10 , 2 ) and [ -1 ] 15 minute close <= [ -1 ] 15 minute supertrend( 10 , 2 ) ) ) and( {33489} ( [0] 15 minute adx di positive( 14 ) > [0] 15 minute adx( 14 ) and [ -1 ] 15 minute adx di positive( 14 ) <= [ -1 ] 15 minute adx( 14 ) or [0] 15 minute adx di positive( 14 ) > [0] 15 minute adx( 14 ) ) ) and( {33489} ( [0] 15 minute adx( 14 ) > [0] 15 minute adx di negative( 14 ) and [ -1 ] 15 minute adx( 14 ) <= [ -1 ] 15 minute adx di negative( 14 ) or [0] 15 minute adx( 14 ) > [0] 15 minute adx di negative( 14 ) ) ) and( {33489} ( 1 day ago low = 1 day ago min( 20 , latest low ) or 2 days ago low = 2 days ago min( 20 , latest low ) or 3 days ago low = 3 days ago min( 20 , latest low ) or 4 days ago low = 4 days ago min( 20 , latest low ) or 5 days ago low = 5 days ago min( 20 , latest low ) ) ) ) ) ) ) ) ) or( {33489} ( ( {33489} ( latest close > 200 and latest close < 1000 and latest close < latest open and latest close < 1 day ago close and( {33489} ( ( {33489} ( [0] 5 minute macd line( 26,12,9 ) < 0 and [ -1 ] 5 minute macd line( 26,12,9 ) >= 0 or [0] 5 minute macd line( 26,12,9 ) < 0 ) ) and( {33489} ( [0] 5 minute macd line( 26,12,9 ) < [0] 5 minute macd signal( 26,12,9 ) and [ -1 ] 5 minute macd line( 26,12,9 ) >= [ -1 ] 5 minute macd signal( 26,12,9 ) or [0] 5 minute macd line( 26,12,9 ) < [0] 5 minute macd signal( 26,12,9 ) ) ) and( {33489} ( [0] 5 minute adx di negative( 14 ) > [0] 5 minute adx di positive( 14 ) and [ -1 ] 5 minute adx di negative( 14 ) <= [ -1 ] 5 minute adx di positive( 14 ) or [0] 5 minute adx di negative( 14 ) > [0] 5 minute adx di positive( 14 ) ) ) and( {33489} ( [0] 5 minute adx di negative( 14 ) > [0] 5 minute adx( 14 ) ) ) and( {33489} ( [0] 5 minute adx( 14 ) > [0] 5 minute adx di positive( 14 ) and [ -1 ] 5 minute adx( 14 ) <= [ -1 ] 5 minute adx di positive( 14 ) or [0] 5 minute adx( 14 ) > [0] 5 minute adx di positive( 14 ) ) ) and( {33489} ( [0] 5 minute rsi( 14 ) < 40 or [0] 5 minute rsi( 14 ) < 40 and [ -1 ] 5 minute rsi( 14 ) >= 40 ) ) and( {33489} ( [0] 5 minute close < [0] 5 minute supertrend( 10 , 2 ) or [0] 5 minute close < [0] 5 minute supertrend( 10 , 2 ) and [ -1 ] 5 minute close >= [ -1 ] 5 minute supertrend( 10 , 2 ) ) ) and( {33489} ( [0] 15 minute close < [0] 15 minute supertrend( 10 , 2 ) or [0] 15 minute close < [0] 15 minute supertrend( 10 , 2 ) and [ -1 ] 15 minute close >= [ -1 ] 15 minute supertrend( 10 , 2 ) ) ) and( {33489} ( [0] 15 minute adx di negative( 14 ) > [0] 15 minute adx( 14 ) or [0] 15 minute adx di negative( 14 ) > [0] 15 minute adx( 14 ) and [ -1 ] 15 minute adx di negative( 14 ) <= [ -1 ] 15 minute adx( 14 ) ) ) and( {33489} ( [0] 15 minute adx( 14 ) > [0] 15 minute adx di positive( 14 ) or [0] 15 minute adx( 14 ) > [0] 15 minute adx di positive( 14 ) and [ -1 ] 15 minute adx( 14 ) <= [ -1 ] 15 minute adx di positive( 14 ) ) ) and( {33489} ( 1 day ago high = 1 day ago max( 20 , latest high ) or 2 days ago high = 2 days ago max( 20 , latest high ) or 3 days ago high = 3 days ago max( 20 , latest high ) or 4 days ago high = 4 days ago max( 20 , latest high ) or 5 days ago high = 5 days ago max( 20 , latest high ) ) ) ) ) ) ) ) ) ) ) '},
	        success: function(response){
	        	
	        	alert(response) ;	    
	        	},

	        error: function(){                      
	            alert('Error while request..');
	        }
	    }); 

	}
</script>
</head>
<body>

<button type="button" onclick="loadDoc()">Request data</button>

</body>
</html>