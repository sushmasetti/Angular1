import { Maths } from './maths';

// describe('Maths', () => {
//   it('should create an instance', () => {
//     expect(new Maths()).toBeTruthy();
//   });
// });

describe('Test Add functionality', () => {
  let obj=new Maths();
  it("True equals True",()=>{
expect(true).toBe(true);
expect(true).toBeTruthy();

  });
it('should create an object', () => {
 
  expect(obj).toBeTruthy;
  expect(obj).toBeDefined;
});

  it("should add 2 numbers",()=>{
    
let n1=10;let n2=40;
expect(obj.Add(n1,n2)).toEqual(50);
  });

  it("should subtract 2 numbers if one is negative ",()=>{
let n1=10; let n2=-20;
expect(obj.Add(n1,n2)).toEqual(-10);
  });
});



describe('Test Subtract functionality', () => {
  let obj1=new Maths();
 
it('should create an object', () => {
 
  expect(obj1).toBeTruthy;
  expect(obj1).toBeDefined;
});

  it("should sub 2 numbers",()=>{
    
let n1=10;let n2=40;
expect(obj1.Sub(n1,n2)).toEqual(-30);
  });

  it("should add 2 numbers if one is negative ",()=>{
let n1=10; let n2=-20;
expect(obj1.Sub(n1,n2)).toEqual(30);
  });
});

describe('Test Mul functionality', () => {
  let obj2=new Maths();
 
it('should create an object', () => {
 
  expect(obj2).toBeTruthy;
  expect(obj2).toBeDefined;
});

  it("should mul 2 numbers",()=>{
    
let n1=10;let n2=40;
expect(obj2.Mul(n1,n2)).toEqual(400);
  });

  it("should add 2 numbers if one is negative ",()=>{
let n1=10; let n2=-20;
expect(obj2.Mul(n1,n2)).toEqual(-200);
  });
});