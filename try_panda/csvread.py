import pandas as pd
import csv

df = pd.read_csv("grades.csv")

new_headers = []

for col in df.columns:
    col_stripped = col.strip()

    new_headers.append(col_stripped)

df.columns = new_headers

null_rows = df[df.isnull().any(axis=1)]

null_rows.to_csv("errors.csv",header = None, index=False)

error = pd.read_csv("errors.csv")

data_list = []

for row in error:
    if not row.startswith("Unnamed"):
        abcd = row.replace('"', "").split()
        for i in abcd:

            strip_row = i.strip()
    
            data_list.append(strip_row)

for index, row in df.iterrows():
    

    if row.isnull().any(axis=0):
        corrupt_index = index


df.loc[corrupt_index] = data_list


print(df.loc[corrupt_index])



df.to_csv("completed.csv")




    
    














# df['"Test1"'] = df['"Test1"'].str.replace(r'\D', '', regex=True).astype(int)
# df.to_csv("grades.csv",index=False)



# d = (df.loc[8])
# row_index = 8
# start_column = '"Test1"'

# subset = df.loc[row_index, start_column:]

# shifted_row = subset.shift(-1)
# df.loc[row_index, start_column:] = shifted_row
# df.to_csv('grades.csv',index=False)

# print(df.dtypes)

# print(df)

# print(df.loc[8]) # will locate 0th row of the csv file and print it
# print(pd.options.display.max_rows)//Will show max number of rows


# print(df.head()) //Will print top 5 rows of the csv file if we have to specify how many number of rows we want in head
# print(df.tail()) #Will print bottom 5 rows of the csv file if we have 

# print(df.info()) #WIll print info about  the table




# for x in df.index:
#     if df.loc[x,"Test1"] < 30:
#         df.loc[x,"Test1"] = 41



# csv_filename = "grades.csv"


# with open(csv_filename) as f:
#     reader = csv.DictReader(f)
#     for row in reader:
#         if "Last name" :'Airpump':





